package model;

/**
 * Clase que modela una tabla dentro del Restaurante. 
 */
public class Table {
    private Integer tableNumber;
    private Integer capacity; 
    private Boolean isOccupied;
    private Order currentOrder;
    
    public Table(Integer tableNumber, Integer capacity, Boolean isOccupied, Order currentOrder) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = isOccupied;
        this.currentOrder = currentOrder;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Boolean getIsOccupied() {
        return isOccupied;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    
    public void assignOrder(Order order){
        currentOrder = order; 
        isOccupied = true; 
    }

    public void clearTable(){
        isOccupied = false; 
        currentOrder = null;
    }
}

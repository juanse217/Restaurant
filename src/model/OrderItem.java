package model;

/**
 * Clase que modela los items de una orden.
 */
public class OrderItem {
    private Integer quantity; 
    private MenuItem menuItem;

    public OrderItem(Integer quantity, MenuItem menuItem) {
        this.quantity = quantity;
        this.menuItem = menuItem;
    } 

    public Integer getQuantity() {
        return quantity;
    }
    public MenuItem getMenuItem() {
        return menuItem;
    }

    /**
     * Metodo para calcular el subtotal. 
     * @return el valor del MenuItem por la cantidad. 
     */
    public Double calculateSubTotal(){
        return (menuItem.getPrice() * quantity); 
    }
}

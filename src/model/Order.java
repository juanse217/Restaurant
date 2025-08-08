package model;

public class Order {
    private Integer orderNumber; 

    //Relacion de dependencia con OrderStatus (enum)
    private OrderStatus status; 

    //Composicion con OrderItems
    private OrderItem[] items;

    

    public Order(Integer orderNumber, OrderStatus status, OrderItem[] items) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.items = items;
    }

    

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderItem[] getItems() {
        return items;
    }//Cuidado devolviendo objetos

    
    
    
}

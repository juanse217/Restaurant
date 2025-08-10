package model;

/**
 * Clase que modela la orden de una mesa.
 */
public class Order {
    private Integer orderNumber;

    // Relacion de dependencia con OrderStatus (enum)
    private OrderStatus status;

    // Composicion con OrderItems
    private OrderItem[] items;

    //Relacion biriderccional con Table. 
    private Table table; 

    public Order(Integer orderNumber, OrderStatus status, int maxItems, Table table) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.items = new OrderItem[maxItems]; // Commposicion
        this.table = table;
    }
    
    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
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
    }// Cuidado devolviendo objetos

    /**
     * Itera par el arreglo de OrderItem para encontrar el primer null y agregar el
     * item
     * 
     * @param item sera anadido al arreglo si tiene posiciones null (hay espacio)
     */
    public void addItem(OrderItem item) {
        if (checkIfFull()) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) { // Si usamos un else para el caso de que no haya null, se repetira constantemente parque habra espacios ya usados.
                    items[i] = item;
                    return;
                }

            }
        }else{
            System.out.println("there's not enough space for the item " + item.getMenuItem().getName());
        }

    }

    private boolean checkIfFull() {
        for (OrderItem orderItem : items) {
            if (orderItem == null) {
                return true;
            }
        }

        return false;
    }

    /**
     * Metodo para calcular el total de la orden
     * 
     * @return la suma de los subtotales de cada OrderItem
     */
    public Double calculateTotal() {
        Double adder = 0.0;
        for (OrderItem orderItem : items) {
            adder += orderItem.calculateSubTotal();
        }
        return adder;
    }

    /**
     * Muestra todos los detalles de la orden. Incluidos los que hacen parte de
     * MenuItem
     */
    public void displayDetails() {
        System.out.printf("Order #: %d\nStatus: %s\n", orderNumber, status);
        for (OrderItem orderItem : items) {

            System.out.printf("Quantity: %d\nPrice: %.1f\nName: %s\n", orderItem.getQuantity(),
                    orderItem.getMenuItem().getPrice(), orderItem.getMenuItem().getName());
        }
    }

}

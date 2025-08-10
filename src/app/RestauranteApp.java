package app;

import model.Employee;
import model.Menu;
import model.MenuItem;
import model.Order;
import model.OrderItem;
import model.OrderStatus;
import model.Table;
import service.Restaurant;

public class RestauranteApp {
    public static void main(String[] args) {
        //items para agregar a Menu
        MenuItem menuItem = new MenuItem("Jugo de borojo", 20.0); 
        MenuItem menuItem1 = new MenuItem("Jugo de manzana", 10.0); 
        MenuItem menuItem2 = new MenuItem("Jugo de uva", 25.0);

        //Creacion de array previo para pasar a Menu. 
        MenuItem[] menuItems = {menuItem, menuItem1, menuItem2}; 
        Menu menu = new Menu("Menu super", menuItems);

        //Creacion de Table y Employee para crear Restaurant. 
        Table table = new Table(1, 4, false, null);
        Table table1 = new Table(2, 4, false, null);
        Table table2 = new Table(3, 4, false, null);
        Table[] tables = {table, table1, table2};

        Employee employee = new Employee("juan");
        Employee employee1 = new Employee("jose");
        Employee employee2 = new Employee("Manu");
        Employee[] employees = {employee, employee1, employee2}; 
        Restaurant restaurant = new Restaurant("Juanito alimana", "carrera 50", menu, employees, tables);

        restaurant.displayMenu();

        //Creacion de Order y OrderItems usando el findItem() de menu. Componiendo la orden de los OrderItems
        Order order = new Order(12, OrderStatus.PENDING, 3, table);
        OrderItem orderItem = new OrderItem(2, menu.findItem("Jugo de borojo"));
        OrderItem orderItem1 = new OrderItem(3, menu.findItem("Jugo de uva"));
        OrderItem orderItem2 = new OrderItem(1, menu.findItem("Jugo de manzana"));
        OrderItem orderItem3 = new OrderItem(3, menu.findItem("Jugo de uva"));


        order.addItem(orderItem);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);

        //encontramos una mesa y le agregamos una orden
        restaurant.findTable(1).assignOrder(order);
        
        //mostramos detalles de la orden e imprimimos el total
        order.displayDetails();
        System.out.println("TOTAL: " + order.calculateTotal());
        
        //mostramos la relacion bidirceccional de Table y Order. 

        System.out.println(order.getTable().getTableNumber());
        System.out.println(table.getCurrentOrder().getOrderNumber());
        
    
    }
}

package model;

/**
 * modela los items del menu
 */
public class MenuItem {
    private String name; 
    private Double price;
    
    public MenuItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    } 

    
}

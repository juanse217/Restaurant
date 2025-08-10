package service;

import model.Employee;
import model.Menu;
import model.Table;

/**
 * Clase restaurante, nos da el funcionamiento del sistema. 
 */
public class Restaurant {
    private String name; 
    private String address;
    private Menu menu; //relacion de agregacion 
    private Employee[] employees; //agregacion
    private Table[] tables; //agregacion

    
    public Restaurant(String name, String address, Menu menu, Employee[] employees, Table[] tables) {
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.employees = employees;
        this.tables = tables;
    }


    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public Menu getMenu() {
        return menu;
    }


    public Employee[] getEmployees() {
        return employees;
    }


    public Table[] getTable() {
        return tables;
    }

    public void displayMenu(){
        menu.displayItems();
    }

    /**
     * Retorna el objeto Table del numero especificado
     * @param tableNumber numero de tabla buscado. 
     * @return Objeto Table si se encuentra, null si no se encuentra. 
     */
    public Table findTable(Integer tableNumber){
        for (int i = 0; i < tables.length; i++) {
            if(tableNumber == tables[i].getTableNumber()){
                return tables[i];
            }
        }

        return null; 
    }
}

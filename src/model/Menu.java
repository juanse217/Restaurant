package model;

public class Menu {
    private String name; 
    private MenuItem[] menuItems;

    public Menu(String name, MenuItem[] menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    } 

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public String getName() {
        return name;
    }
    
    /**
     * Muestra todos los elementos que hacen parte del menu
     */
    public void displayItems(){
        for (MenuItem menuItem : menuItems) {
            System.out.println("Name: " + menuItem.getName() + " Price: " + menuItem.getPrice());
        }
    }

    /**
     * Metodo para encontrar un item en el menu
     * @param itemName el nombre del item que se quiere encontrar
     * @return el objeto de MenuItem encontrado (en caso de)
     */
    public MenuItem findItem(String itemName){
        for (MenuItem menuItem : menuItems) {
            if(itemName.equals(menuItem.getName())){
                return menuItem;
            }
        }
        return null; 
    }
}

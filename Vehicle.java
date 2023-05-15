
public class Vehicle {
    private String type;
    private int row;
    private int column;
    
    public Vehicle(String type, int row, int column) {
        this.type = type;
        this.row = row;
        this.column = column;
    }
    
    public void moveTo(Position position) {
        // Update the row and column of the vehicle to the new position
        this.row = position.getRow();
        this.column = position.getColumn();
    }
    
    public void loadProduct(Products product) {
        // Logic to load the product onto the vehicle
        // You can add the product to a list of loaded products or perform any other required operations
        System.out.println("Loading product: " + product.getName() + " onto the " + type);
    }
    
    public void unloadProduct(Products product) {
        // Logic to unload the product from the vehicle
        // You can remove the product from the list of loaded products or perform any other required operations
        System.out.println("Unloading product: " + product.getName() + " from the " + type);
    }
   
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getRow() {
        return row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    
    public int getColumn() {
        return column;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }
}

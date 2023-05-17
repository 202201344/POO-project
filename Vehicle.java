
public abstract class Vehicle implements Movable{
    private String type;
    private Position position;
    
    public Vehicle(String type, Position position) {
        this.type = type;
        this.position = position;
    }
    
    // lets say that the warehouse is a size of 10x10
    
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
    
    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override

    public void moveUp() {
        int currentRow = position.getRow();
        if (currentRow > 0) {
            position = new Position(currentRow - 1, position.getColumn());
        }
    }

    @Override

    public void moveDown() {
        // Adjust the boundary according to the warehouse size
        int maxRows = 10;/* Maximum number of rows in the warehouse */;
        int currentRow = position.getRow();
        if (currentRow < maxRows - 1) {
            position = new Position(currentRow + 1, position.getColumn());
        }
    }

    @Override
    public void moveLeft() {
        int currentColumn = position.getColumn();
        if (currentColumn > 0) {
            position = new Position(position.getRow(), currentColumn - 1);
        }
    }

    @Override
    public void moveRight() {
        // Adjust the boundary according to the warehouse size
        int maxColumns = 10;/* Maximum number of columns in the warehouse */;
        int currentColumn = position.getColumn();
        if (currentColumn < maxColumns - 1) {
            position = new Position(position.getRow(), currentColumn + 1);
        }
    }


}

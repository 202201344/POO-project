
public abstract class Vehicle implements Movable{
    private String type;
    private Position position;
    
    public Vehicle(String type, Position position) {
        this.type = type;
        this.position = position;
    }
    
    //the warehouse is a size of 10x10
    
    public void loadProduct(Package packages) {
        
        System.out.println("Loading product: " + packages.getType() + " onto the " + type);
    }
    
    public void unloadProduct(Package packages) {
       
        System.out.println("Unloading product: " + packages.getType() + " from the " + type);
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
        int maxRows = 10;
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
        int maxColumns = 10;
        int currentColumn = position.getColumn();
        if (currentColumn < maxColumns - 1) {
            position = new Position(position.getRow(), currentColumn + 1);
        }
    }


}

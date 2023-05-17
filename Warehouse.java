public class Warehouse {
    private StorageLocation[][] storageLocations;
    private Vehicle[][] vehicles;
    private Position pickupLocation;
    private Position deliveryLocation;
    
    public Warehouse(int rows, int columns) {
        storageLocations = new StorageLocation[rows][columns];
        vehicles = new Vehicle[rows][columns];
    }
    
    public void addStorageLocation(StorageLocation storageLocation) {
        int row = storageLocation.getPosition().getRow();
        int column = storageLocation.getPosition().getColumn();
        storageLocations[row][column] = storageLocation;
    }
    
    public StorageLocation getStorageLocation(int row, int column) {
        return storageLocations[row][column];
    }
    
    public void addVehicle(Vehicle vehicle) {
        //int row = vehicle.getRow();
        //int column = vehicle.getColumn();
        //vehicles[row][column] = vehicle;
    }
    
    public Vehicle getVehicle(int row, int column) {
        return vehicles[row][column];
    }
    
    public Position getPickupLocation() {
        return pickupLocation;
    }
    
    public void setPickupLocation(Position pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
    
    public Position getDeliveryLocation() {
        return deliveryLocation;
    }
    
    public void setDeliveryLocation(Position deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
}

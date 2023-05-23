public class Warehouse {
    private StorageLocation[][] storageLocations;
    
    public Warehouse(int rows, int columns) {
        storageLocations = new StorageLocation[rows][columns];
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
    
}

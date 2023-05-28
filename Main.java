import java.util.List;


public class Main {
    public MapReader mapReader = new MapReader("warehouse_model.txt");
    int rows = mapReader.getRows();
    int columns = mapReader.getColumns();
    private Vehicle vehicle;
    private PickupLocation packagequeue;
    public Main(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }


    public void simulatePackageDelivery(Vehicle vehicle, PickupLocation pickupLocation, DeliveryLocation deliveryLocation) {
        System.out.println("Starting package delivery simulation...");

        // Move to the pickup location
        vehicle.setPosition(pickupLocation.position);  // Temporary with the setPosition

        // Perform pickup operation
        vehicle.loadProduct(packagequeue.package1);

        // Move to the first destination within the warehouse
        moveToLocation(deliveryLocation.getPosition());

        // Perform delivery operation within the warehouse
        vehicle.setPosition(deliveryLocation.getPosition());  // Temporary with the setPosition

        // Perform unload of the product

        vehicle.unloadProduct(packagequeue.package1);
        // Move to the final delivery location
        moveToLocation(pickupLocation.position);

        System.out.println("Package delivery simulation completed.");
    }

    
    private void moveToLocation(Position destination) {
        List<Position> path = mapReader.findShortestPath(vehicle.getPosition(), destination);

        if (path == null) {
            System.out.println("Unable to reach the destination. Aborting simulation.");
            return;
        }

        for (Position position : path) {
            vehicle.setPosition(position); // Temporary with the setPosition
            System.out.println("Moved to position: " + position);
        }
    }

    PickupLocation pickupLocation = new PickupLocation(new Position(1, 1));
    DeliveryLocation deliveryLocation = new DeliveryLocation(new Position(3, 3));


public void main(String args[])
{
    simulatePackageDelivery(vehicle,pickupLocation, deliveryLocation);
}

    public void printMap() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Position position = new Position(i, j);
                int value = mapReader.getValueAt(position.getRow(),position.getColumn());
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

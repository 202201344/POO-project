import java.util.ArrayList;
import java.util.List;

public class PickupLocation {
    Position position;
    List<Package> packages;

    public PickupLocation(Position position) {
        this.position = position;
        packages = new ArrayList<>();
    }
    
    public void addProductToQueue(Package packages){
        this.packages.add(packages);
    }
    
    public Position getPosition() {
        return position;
    }
}

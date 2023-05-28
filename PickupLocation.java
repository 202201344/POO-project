import java.util.ArrayList;
import java.util.List;

public class PickupLocation {
    Position position;
    List<Package> packages;

    Package package1 = new Package(PackagingType.BOX, "ABC123");
    Package package2 = new Package(PackagingType.CARDBOARD_BOX, "DEF456");
    
    public PickupLocation(Position position) {
        this.position = position;
        packages = new ArrayList<>();
    }
    
    public void addProductToQueue(Package packages){
        this.packages.add(package1);
        this.packages.add(package2);
    }
    
    public Position getPosition() {
        return position;
    }
}

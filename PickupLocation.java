import java.util.ArrayList;
import java.util.List;

public class PickupLocation {
    Position position;
    private List<Products> products;

    public PickupLocation(Position position) {
        this.position = position;
        products = new ArrayList<>();
    }
    
    public void pickUpProduct(Products product) {
        products.add(product);
    }

    public Position getPosition() {
        return position;
    }
}

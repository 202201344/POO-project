import java.util.ArrayList;
import java.util.List;

public class StorageLocation {
    private Position position;
    private List<Products> products;
    
    public StorageLocation(Position position) {
        this.position = position;
        products = new ArrayList<>();
    }
    
    public void storeProduct(Products product) {
        products.add(product);
    }
    
    public void sellProduct(Products product) {
        products.remove(product);
    }
    
    public List<Products> getProducts() {
        return products;
    }
    
    public Position getPosition() {
        return position;
    }
}
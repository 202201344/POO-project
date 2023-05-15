public class Products {
    private String name;
    private String identifier;
    private double weight;
    private String type;
    
    public Products(String name, String identifier, double weight, String type) {
        this.name = name;
        this.identifier = identifier;
        this.weight = weight;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }

    public String getId(){
        return identifier;
    }

    public double getWeight(){
        return weight;
    }

    public String getType(){
        return type;
    }

    public void setName(String index){
        name = index;
    }

    public void setIdentifier(String index){
        identifier = index;
    }

    public void setWeight(double index){
        weight = index;
    }

    public void setType(String index){
        type = index;
    }

    public void packageProduct(Package packaging) {
        if (packaging.getType().equals("Bag")) {
            if (type.equals("Clothing") || type.equals("Accessories") || type.equals("Small Toys") || type.equals("Small Electronic Equipment")) {
                // Packaging logic for a Bag
                System.out.println("Packaging the product in a bag.");
            } else {
                System.out.println("Cannot package this product in a bag.");
            }
        } else if (packaging.getType().equals("Box")) {
            if (!type.equals("Clothing")) {
                // Packaging logic for a Box
                System.out.println("Packaging the product in a box.");
            } else {
                System.out.println("Cannot package product in a box.");
            }
        } else if (packaging.getType().equals("Cardboard Box")) {
            // Packaging logic for a Cardboard Box
            System.out.println("Packaging the product in a cardboard box.");
        } else if (packaging.getType().equals("Pallet")) {
            // Packaging logic for a Pallet
            System.out.println("Packaging the product on a pallet.");
        } else {
            System.out.println("Invalid packaging type.");
        }
    }
    
    @Override
    public String toString() {
        return "Product: " + name + 
               "\nIdentifier: " + identifier +
               "\nWeight: " + weight +
               "\nType: " + type;
    }
}


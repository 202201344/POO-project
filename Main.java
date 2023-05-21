import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MapReader mapReader = new MapReader("warehouse_model.txt");
        int rows = mapReader.getRows();
        int columns = mapReader.getColumns();

        Package package1 = new Package(PackagingType.BOX, "ABC123");
        Package package2 = new Package(PackagingType.CARDBOARD_BOX, "DEF456");

        List<Package> packages = new ArrayList<>();
        packages.add(package1);
        packages.add(package2);
        
        // Print the map
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Position position = new Position(i, j);
                int value = mapReader.getValueAt(position);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

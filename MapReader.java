import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapReader {
    private int[][] map;
    private int rows;
    private int columns;

    public MapReader(String warehouse_model) {
        readMap(warehouse_model);
    }

    private void readMap(String warehouse_model) {
        try (BufferedReader reader = new BufferedReader(new FileReader(warehouse_model))) {
            String line;
            int row = 0;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.trim().split("\\s+");
                if (row == 0) {
                    columns = elements.length;
                    map = new int[rows][columns];
                }
                for (int col = 0; col < columns; col++) {
                    map[row][col] = Integer.parseInt(elements[col]);
                }
                row++;
            }
            rows = row;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getValueAt(Position position) {
        int row = position.getRow();
        int column = position.getColumn();
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            return map[row][column];
        } else {
            return -1;
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}

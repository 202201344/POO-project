import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MapReader {
    private int[][] map;
    private int rows1;
    private int columns1;

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
                    columns1 = elements.length;
                    map = new int[rows1][columns1];
                }
                for (int col = 0; col < columns1; col++) {
                    map[row][col] = Integer.parseInt(elements[col]);
                }
                row++;
            }
            rows1 = row;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MapReader mapReader = new MapReader("warehouse_model.txt");
    int rows = mapReader.getRows();
    int columns = mapReader.getColumns();

    List<Position> findShortestPath(Position source, Position destination) {
        Queue<Position> queue = new LinkedList<>();
    
        boolean[][] visited = new boolean[mapReader.getRows()][mapReader.getColumns()];
    
        // Create a map to store the parent positions for each visited position
        Map<Position, Position> parentMap = new HashMap<>();
    
        // Enqueue the position and mark it as visited
        queue.add(source);
        visited[source.getRow()][source.getColumn()] = true;
    
        while (!queue.isEmpty()) {
            Position current = queue.poll();
    
            if (current.equals(destination)) {
                return reconstructPath(source, destination, parentMap);
            }
    
            // Get the neighboring positions of the current position
            List<Position> neighbors = getNeighbors(current);
    
            for (Position neighbor : neighbors) {
                // Check if the neighbor is a valid position and has not been visited
                if (isValidPosition(neighbor) && !visited[neighbor.getRow()][neighbor.getColumn()]) {
                    queue.add(neighbor);
                    visited[neighbor.getRow()][neighbor.getColumn()] = true;
                    parentMap.put(neighbor, current);
                }
            }
        }
    
        return null;
    }


    private List<Position> reconstructPath(Position source, Position destination, Map<Position, Position> parentMap) {
        List<Position> path = new ArrayList<>();
        Position current = destination;
    
        // Go from the destination to the source
        while (current != null) {
            path.add(current);
            current = parentMap.get(current);
        }
    
        // Reverse the path to get the correct order from the source to the destination
        Collections.reverse(path);
    
        return path;
    }

    private List<Position> getNeighbors(Position position) {
        List<Position> neighbors = new ArrayList<>();
        int row = position.getRow();
        int column = position.getColumn();
        
        // Up
        if (row > 0 && mapReader.getValueAt(row - 1, column) == 0) {
            neighbors.add(new Position(row - 1, column));
        }
    
        // Down
        if (row < mapReader.getRows() - 1 && mapReader.getValueAt(row + 1, column) == 0) {
            neighbors.add(new Position(row + 1, column));
        }
    
        // Left
        if (column > 0 && mapReader.getValueAt(row, column - 1) == 0) {
            neighbors.add(new Position(row, column - 1));
        }
    
        // Right
        if (column < mapReader.getColumns() - 1 && mapReader.getValueAt(row, column + 1) == 0) {
            neighbors.add(new Position(row, column + 1));
        }
    
        return neighbors;
    }

    private boolean isValidPosition(Position position) {
        int row = position.getRow();
        int column = position.getColumn();
    
        return row >= 0 && row < mapReader.getRows() && column >= 0 && column < mapReader.getColumns();
    }
    

    public int getValueAt(int row, int column) {
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

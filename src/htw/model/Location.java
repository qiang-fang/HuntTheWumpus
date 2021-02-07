package htw.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Location {
  int id;
  int rowCoordinate;
  int columnCoordinate;
  List<Integer> adjacencyList;
  TypeOfLocation type;
  Map<TypeOfDifficulty,Boolean> difficulty;

  Location(int id, int rowCoordinate, int columnCoordinate) {
    this.id = id;
    this.rowCoordinate = rowCoordinate;
    this.columnCoordinate = columnCoordinate;
    adjacencyList = new ArrayList<>();
    difficulty = new HashMap<>();
    difficulty.put(TypeOfDifficulty.WUMPUS,false);
    difficulty.put(TypeOfDifficulty.PIT,false);
    difficulty.put(TypeOfDifficulty.BAT,false);
  }
}

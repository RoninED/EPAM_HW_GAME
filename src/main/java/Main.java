import creatures.OrcKnight;
import map.GameMap;


public class Main {
    public static void main(String[] args) {
        OrcKnight orcPetr = new OrcKnight("Petr");

        GameMap.setCreatureToCell(orcPetr, 1);
    }
}

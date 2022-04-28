package gamePlay;

import creatures.utils.AbstractCreature;
import creatures.utils.DataOfCreatures;

import java.util.HashMap;

public abstract class GameMap {

    static HashMap<Integer, Cell> cells = new HashMap<>() {{
        put(1, new Cell(1));
        put(2, new Cell(2));
        put(3, new Cell(3));
        put(4, new Cell(4));
        put(5, new Cell(5));
        put(6, new Cell(6));
        put(7, new Cell(7));
        put(8, new Cell(8));
        put(9, new Cell(9));
        put(10, new Cell(10));
    }};


    public static int findCreatureCell(AbstractCreature creature) {
        for (java.util.Map.Entry<Integer, Cell> entry : cells.entrySet()) {
            if (entry.getValue().getCreatureID() == creature.ID) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static boolean setCreatureToCell(AbstractCreature creature, int xCoordinate) {
        if (cells.get(xCoordinate).CreatureID == 0 & findCreatureCell(creature) != xCoordinate) {
            cells.get(xCoordinate).CreatureID = creature.ID;
            System.out.println(creature.NAME + " move to cell " + xCoordinate);
            return true;
        } else {
            System.out.println("Cell " + xCoordinate + " is busy");
            return false;
        }
    }

    public static boolean deleteCreatureFromCell(AbstractCreature creature) {
        int creaturePosition = findCreatureCell(creature);

        if (creaturePosition != 0) {
            cells.get(creaturePosition).setCreatureID(0);
            System.out.println(creature.NAME + " leave cell " + creaturePosition);
            return true;
        } else {
            System.out.println("creature not founded");
            return false;
        }
    }

    public static boolean moveCreature(AbstractCreature creature, int coordinateTo) {
        if (checkMovePossibility(creature, coordinateTo)) {
            deleteCreatureFromCell(creature);
            setCreatureToCell(creature, coordinateTo);
            return true;
        } else {
            System.out.println(creature.NAME + "can't move");
            return false;
        }
    }

    private static boolean checkMovePossibility(AbstractCreature creature, int coordinateTo) {
        ;
        return GameMap.cells.get(coordinateTo).CreatureID == 0 & Math.abs(cells.get(findCreatureCell(creature)).getX_COORDINATE() - coordinateTo) < creature.ActualSpeed;
    }

    public static void printMap() {
        cells.forEach((k, v) -> {
            System.out.println(k + ": " + v.CreatureID);
        });
    }

    public static void printMap1() {
        System.out.println("\n-----MAP----------");
        cells.forEach((k, v) -> {
            if (v.CreatureID != 0) {
                System.out.println(k + ": " +
                        DataOfCreatures.creatures.get(v.CreatureID).TYPE +
                        " "
                        + DataOfCreatures.creatures.get(v.CreatureID).NAME);
            } else System.out.println(k + ": ");
        });
        System.out.println("-----MAP----------\n");
    }

    private static class Cell {
        private final int X_COORDINATE;
        private int CreatureID = 0;

        Cell(int x_coordinate) {
            X_COORDINATE = x_coordinate;
        }

        public int getX_COORDINATE() {
            return X_COORDINATE;
        }

        public int getCreatureID() {
            return CreatureID;
        }

        public void setCreatureID(int creatureID) {
            CreatureID = creatureID;
        }
    }
}

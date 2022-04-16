package map;

import creatures.utils.AbstractCreature;

import java.util.HashMap;

abstract class Map {

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

    static boolean setCreatureToCell(AbstractCreature creature, int xCoordinate) {
        if (cells.get(xCoordinate).CreatureID != 0) {
            cells.get(xCoordinate).CreatureID = creature.ID;
            System.out.println(creature.NAME + "move to cell " + xCoordinate);
            return true;
        } else {
            System.out.println("Cell " + xCoordinate + "is busy");
            return false;
        }
    }

    static boolean deleteCreatureFromCell(AbstractCreature creature) {
        for (java.util.Map.Entry<Integer, Cell> entry : cells.entrySet()) {
            if (entry.getValue().getCreatureID() == creature.ID) {
                entry.getValue().setCreatureID(0);
                System.out.println(creature.NAME + " was defeated");
                return true;
            }
        }
        System.out.println("creature not founded");
        return false;
    }

//    static boolean moveCreature(AbstractCreature creature, int coordinateTo) {
//        if (checkMovePossibility(creature, coordinateTo)){
//            System.out.println(creature.NAME + "move from " + creature);
//        if (deleteCreatureFromCell(creature) & setCreatureToCell(creature, coordinateTo)) {
//            return true;
//        }}
//        else return false;
//    }

    private static boolean checkMovePossibility(AbstractCreature creature, int coordinateTo) {
        for (java.util.Map.Entry<Integer, Cell> entry : cells.entrySet()) {
            if (entry.getValue().getCreatureID() == creature.ID){
                 return Math.abs(entry.getValue().getX_COORDINATE()-coordinateTo) <= creature.ActualSpeed;
            }
        }
        return false;
    }

    private static class Cell {
        private final int X_COORDINATE;
        private int CreatureID;

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

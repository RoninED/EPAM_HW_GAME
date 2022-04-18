import creatures.OrcKnight;
import gamePlay.GameMap;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameMapTests {
    OrcKnight peter = new OrcKnight("Peter", 1);
    OrcKnight gabriel = new OrcKnight("Gabriel", 2);

    @Test
    public void setAndDelCreature() {
        assertTrue(GameMap.setCreatureToCell(peter, 1));
        assertEquals(GameMap.findCreatureCell(peter),1);
        assertTrue(GameMap.deleteCreatureFromCell(peter));
        assertEquals(GameMap.findCreatureCell(peter), 0);
    }

    @Test
    public void setToBusyCellTest() {
        GameMap.setCreatureToCell(peter, 1);
        assertTrue(!GameMap.setCreatureToCell(gabriel, 1));
        System.out.println(GameMap.findCreatureCell(peter));
        System.out.println(GameMap.findCreatureCell(gabriel));

        assertEquals(GameMap.findCreatureCell(gabriel), 0);

        assertEquals(GameMap.findCreatureCell(peter), 1);
    }

    @Test
    public void creatureAlreadyHere() {
        GameMap.setCreatureToCell(peter, 1);
        assertTrue(!GameMap.setCreatureToCell(peter, 1));
    }

    @Test
    public void findCreature() {
        GameMap.setCreatureToCell(peter, 1);
        assertEquals(GameMap.findCreatureCell(peter), 1);
    }

    @Test
    public void notFindedCreature() {
        assertEquals(GameMap.findCreatureCell(peter), 0);
    }

    @Test
    public void moveCreature() {
        GameMap.setCreatureToCell(peter, 1);
        assertTrue(GameMap.moveCreature(peter, 2));
        assertEquals(GameMap.findCreatureCell(peter), 2);
    }

    @Test
    public void cantMoveCreatureCauseBusy() {
        GameMap.setCreatureToCell(peter, 1);
        GameMap.setCreatureToCell(gabriel, 2);
        assertTrue(!GameMap.moveCreature(peter, 2));
        assertEquals(GameMap.findCreatureCell(peter), 1);
    }

    @Test
    public void cantMoveCreatureCauseFar() {
        GameMap.setCreatureToCell(peter, 1);
        assertTrue(!GameMap.moveCreature(peter, peter.ActualSpeed+1));
        assertEquals(GameMap.findCreatureCell(peter), 1);
    }

    @Test
    public void cantMoveToTheSameSpot() {
        GameMap.setCreatureToCell(peter, 1);
        assertTrue(!GameMap.moveCreature(peter, 1));
        assertEquals(GameMap.findCreatureCell(peter), 1);
    }
}

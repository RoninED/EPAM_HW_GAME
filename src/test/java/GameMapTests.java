import creatures.OrcKnight;
import map.GameMap;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GameMapTests {
    OrcKnight peter = new OrcKnight("Peter");
    OrcKnight gabriel = new OrcKnight("Peter");

    @Before
    public void EmptyMap(){

    }

    @Test
    public void setAndDelCreature() {
        assertTrue(GameMap.setCreatureToCell(peter, 1));
        assertTrue(GameMap.deleteCreatureFromCell(peter));
    }

    @Test
    public void setToBusyCellTest() {
        GameMap.setCreatureToCell(peter, 1);
        assertTrue(!GameMap.setCreatureToCell(gabriel, 1));
    }

    @Test
    public void creatureAlreadyHere() {
        GameMap.setCreatureToCell(peter, 1);
        assertTrue(!GameMap.setCreatureToCell(peter, 1));
    }


}

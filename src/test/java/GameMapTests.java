import creatures.OrcKnight;
import map.GameMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameMapTests {
    @Before
    public void emptyMap(){
        GameMap;
    }

    @Test
    public void setCreatureTest(){
        assertTrue(GameMap.setCreatureToCell(new OrcKnight("petr"), 1));
    }

    @Test
    public void setToBusyCellTest(){
//        GameMap.setCreatureToCell(new OrcKnight("petr"), 1);
        assertTrue(!GameMap.setCreatureToCell(new OrcKnight("Gabriel"), 1));
    }


}

import creatures.classesOfCreatures.OrcKnight;
import gamePlay.GameMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbilityTests {
    OrcKnight peter = new OrcKnight("Peter", 1);
    OrcKnight gabriel = new OrcKnight("Gabriel", 2);


    /**
     * When distance more distance skill
     */
    @Test
    public void testMethodIsItUsableWhenDistanceIsLonger() {
        GameMap.setCreatureToCell(peter, 1);

        GameMap.setCreatureToCell(gabriel, GameMap.findCreatureCell(peter) + peter.ABILITIES.get(0).getDISTANCE() + 1);

        assertTrue(!peter.ABILITIES.get(0).isItUsable(peter, gabriel));
    }

    /**
     * When distance is more than distance skill
     */
    @Test
    public void testMethodIsItUsableWhenDistanceIsEqual() {
        GameMap.setCreatureToCell(peter, 1);

        GameMap.setCreatureToCell(gabriel, GameMap.findCreatureCell(peter) + peter.ABILITIES.get(0).getDISTANCE());

        assertTrue(peter.ABILITIES.get(0).isItUsable(peter, gabriel));
    }

    /**
     * When distance is less than distance skill
     */
    @Test
    public void testMethodIsItUsableWhenDistanceIsLess() {
        GameMap.setCreatureToCell(peter, 1);

        GameMap.setCreatureToCell(gabriel, GameMap.findCreatureCell(peter) + peter.ABILITIES.get(0).getDISTANCE()-1);

        assertTrue(peter.ABILITIES.get(0).isItUsable(peter, gabriel));
    }
}

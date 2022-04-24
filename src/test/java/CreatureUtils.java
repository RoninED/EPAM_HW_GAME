import creatures.utils.DataOfCreatures;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreatureUtils {

    @Test
    public void getNewID() {
        assertEquals(DataOfCreatures.getNewIDforCreature(), 0);
    }


    @Test
    public void createNewCreature() {
        assertEquals(DataOfCreatures.getNewIDforCreature(), 0);
    }

}

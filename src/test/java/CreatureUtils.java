import creatures.utils.DataOfCreatures;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreatureUtils {



    @Test
    public void createNewCreature() {
        DataOfCreatures.heroFactory();
        System.setIn(new ByteArrayInputStream(BigInteger.valueOf(1).toByteArray()));

//        assertEquals(DataOfCreatures.getNewIDforCreature(), 0);
    }

}

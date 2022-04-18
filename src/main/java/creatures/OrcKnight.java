package creatures;

import abilities.Abilities;
import creatures.utils.AbstractCreature;
import creatures.utils.MasteryLevels;

import java.util.List;

public class OrcKnight extends AbstractCreature {
    public OrcKnight(String name, int ID){
        super(ID,name,"Ork Knigt", List.of(Abilities.SIMPLE_MELEE_HIT),70,10,60,3,40, MasteryLevels.MIDDLE_3, MasteryLevels.BEGINNER_2, MasteryLevels.NOVICE_1);

    }
}

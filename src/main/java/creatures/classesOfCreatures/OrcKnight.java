package creatures.classesOfCreatures;

import abilities.Abilities;
import creatures.utils.AbstractCreature;
import creatures.utils.CreatureTypes;
import creatures.utils.MasteryLevels;

import java.util.List;

public class OrcKnight extends AbstractCreature {
    final static CreatureTypes TYPE = CreatureTypes.ORC_KNIGHT;

    public OrcKnight(String name, int ID){
        super(ID,name,List.of(Abilities.SIMPLE_MELEE_HIT),70,10,60,3,40, MasteryLevels.MIDDLE_3, MasteryLevels.BEGINNER_2, MasteryLevels.NOVICE_1);
    }
}

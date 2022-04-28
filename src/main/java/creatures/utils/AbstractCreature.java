package creatures.utils;

import abilities.Abilities;

import java.util.List;


public class AbstractCreature {

    public final String TYPE;
    public final int ID;
    public final String NAME;
    public List <Abilities> ABILITIES;

    private final int BASE_HP;
    private final int BASE_SP;
    private final int BASE_DEFENCE;
    private final int BASE_SPEED;
    private final int BASE_AGILITY;
    private final MasteryLevels MELEE_LEVEL;
    private final MasteryLevels RANGE_LEVEL;
    private final MasteryLevels INTELLIGENCE_LEVEL;

    public int ActualHP;
    public int ActualSP;
    public int ActualDefence;
    public int ActualSpeed;
    public int ActualAgility;

    public AbstractCreature(String TYPE, int ID, String NAME, List<Abilities> ABILITIES, int BASE_HP, int BASE_SP, int BASE_DEFENCE, int BASE_SPEED, int BASE_AGILITY, MasteryLevels MELEE_LEVEL, MasteryLevels RANGE_LEVEL, MasteryLevels INTELLIGENCE_LEVEL) {

        //Initialization base parameters
        this.TYPE = TYPE;
        this.ID = ID;
        this.NAME = NAME;
        this.ABILITIES = ABILITIES;
        this.BASE_HP = BASE_HP;
        this.BASE_SP = BASE_SP;
        this.BASE_DEFENCE = BASE_DEFENCE;
        this.BASE_SPEED = BASE_SPEED;
        this.BASE_AGILITY = BASE_AGILITY;
        this.MELEE_LEVEL = MELEE_LEVEL;
        this.RANGE_LEVEL = RANGE_LEVEL;
        this.INTELLIGENCE_LEVEL = INTELLIGENCE_LEVEL;

        //Initialization dynamic parameters
        ActualHP = BASE_HP;
        ActualSP = BASE_SP;
        ActualDefence = BASE_DEFENCE;
        ActualSpeed = BASE_SPEED;
        ActualAgility = BASE_AGILITY;
    }



}



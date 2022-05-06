package abilities;

import creatures.utils.AbstractCreature;
import gamePlay.GameMap;

public enum Abilities {
    SIMPLE_MELEE_HIT("just simple hit in a face", 2, false) {
        @Override
        void printMessageWhenItUsed(AbstractCreature user, AbstractCreature target) {
            System.out.println(user.NAME + " hit in a face " + target.NAME);
        }

        @Override
        void affect(AbstractCreature user, AbstractCreature target) {
            target.ActualHP = target.ActualHP - 1;
        }

        @Override
        public boolean isItUsable(AbstractCreature user, AbstractCreature target) {

            int distance = GameMap.findCreatureCell(user) - GameMap.findCreatureCell(target);

            if (distance < 0) distance = distance * -1;

            return getDISTANCE() >= distance;
        }
    };

    public final String DESCRIPTION;
    private final int DISTANCE;
    private final boolean FOR_SELF;

    Abilities(String DESCRIPTION, int DISTANCE, boolean FOR_SELF) {
        this.DESCRIPTION = DESCRIPTION;
        this.DISTANCE = DISTANCE;
        this.FOR_SELF = FOR_SELF;
    }


    public void use(AbstractCreature User, AbstractCreature Target) {
        printMessageWhenItUsed(User, Target);
        affect(User, Target);
    }

    ;

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public int getDISTANCE() {
        return DISTANCE;
    }

    public boolean getIsItForSelf() {
        return FOR_SELF;
    }

    abstract void printMessageWhenItUsed(AbstractCreature user, AbstractCreature target);

    abstract void affect(AbstractCreature user, AbstractCreature target);

    abstract public boolean isItUsable(AbstractCreature user, AbstractCreature target);
}


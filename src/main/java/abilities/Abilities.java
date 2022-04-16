package abilities;

import creatures.utils.AbstractCreature;

public enum Abilities {
    SIMPLE_MELEE_HIT("just simple hit in a face", 1) {
        @Override
        void printMessageWhenItUsed(AbstractCreature User, AbstractCreature Target) {
            System.out.println(User.NAME + " hit in a face " + Target.NAME);
        }

        @Override
        void affect(AbstractCreature User, AbstractCreature Target) {
            Target.ActualHP = Target.ActualHP - 1;
        }
    };

    private final String DESCRIPTION;
    private final int DISTANCE;

    Abilities(String DESCRIPTION, int DISTANCE) {
        this.DESCRIPTION = DESCRIPTION;
        this.DISTANCE = DISTANCE;
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

    abstract void printMessageWhenItUsed(AbstractCreature User, AbstractCreature Target);

    abstract void affect(AbstractCreature User, AbstractCreature Target);
}


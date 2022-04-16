package abilities;

import creatures.utils.AbstractCreature;

public enum Abilities {

    SimpleMeleeHit("Simple Melee hit", 1) {
        @Override
        public void use(AbstractCreature User, AbstractCreature Target) {
            System.out.println("The " + User.TYPE + " has hit to face the " + Target.TYPE);
        }
    };

    private final String DESCRIPTION;
    private final int DISTANCE;

    Abilities(String DESCRIPTION, int DISTANCE) {
        this.DESCRIPTION = DESCRIPTION;
        this.DISTANCE = DISTANCE;
    }


    public abstract void use(AbstractCreature User, AbstractCreature Target);

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public int getDISTANCE() {
        return DISTANCE;
    }
}

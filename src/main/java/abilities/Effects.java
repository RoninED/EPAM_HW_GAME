package abilities;

import creatures.utils.AbstractCreature;

public enum Effects {

TEST("test", false){
    @Override
    void apply(AbstractCreature creature) {

    }
};
    
    private final String NAME;
    private final boolean UNLIMITED_DURATION;

    abstract void apply(AbstractCreature creature);

    Effects(String NAME, boolean UNLIMITED_DURATION) {
        this.NAME = NAME;
        this.UNLIMITED_DURATION = UNLIMITED_DURATION;
    }
}

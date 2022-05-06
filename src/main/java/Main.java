import abilities.Abilities;
import creatures.utils.AbstractCreature;
import creatures.utils.DataOfCreatures;
import gamePlay.GameMap;

public class Main {
    static AbstractCreature player1;
    static AbstractCreature player2;

    public static void main(String[] args) {
        gamePlay();
    }

    static void gamePlay() {
        phase1Creating();
        actionChooser(player1, player2);
    }

    private static void phase1Creating() {
        System.out.println("Player 1, choose you fighter!!!");
        player1 = DataOfCreatures.heroFactory();
        GameMap.setCreatureToCell(player1, 1);


        System.out.println("Player 2, choose you fighter!!!");

        player2 = DataOfCreatures.heroFactory();
        GameMap.setCreatureToCell(player2, 2);

        DataOfCreatures.printListOfCreatures();

        GameMap.printMap1();

    }

    private static void actionChooser(AbstractCreature player, AbstractCreature enemy) {
        boolean actionIsDone = false;

        actionIsDone = tryToUseAbility(player, enemy);
    }

    private static boolean tryToUseAbility(AbstractCreature player, AbstractCreature enemy){
        boolean actionIsDone = false;

        for (Abilities ability : player.ABILITIES
        ) {
            if (ability.isItUsable(player, enemy)){
                if (ability.getIsItForSelf()){
                    ability.use(player, player);
                }
                else ability.use(player, enemy);
                actionIsDone = true;
                break;
            }
        }
        return actionIsDone;
    }


}

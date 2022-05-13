import abilities.Abilities;
import creatures.utils.AbstractCreature;
import creatures.utils.DataOfCreatures;
import gamePlay.GameMap;

import java.util.Scanner;

public class Main {
    static AbstractCreature player1;
    static AbstractCreature player2;

    public static void main(String[] args) {
        Aaaa aaaa = new Aaaa();
        increase(aaaa);

        System.out.println(aaaa.str);
    }

    public static void increase(Aaaa b) {
        b.str = "bbbb";

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
        GameMap.setCreatureToCell(player2, 8);

        DataOfCreatures.printListOfCreatures();

        GameMap.printMap1();

    }

    private static void actionChooser(AbstractCreature player, AbstractCreature enemy) {
        boolean actionIsDone = false;

        actionIsDone = tryToUseAbility(player, enemy);
        if (!actionIsDone) actionIsDone = moveToEnemy(player, enemy);
    }

    private static boolean tryToUseAbility(AbstractCreature player, AbstractCreature enemy) {
        boolean actionIsDone = false;

        for (Abilities ability : player.ABILITIES
        ) {
            if (ability.isItUsable(player, enemy)) {
                if (ability.getIsItForSelf()) {
                    ability.use(player, player);
                } else ability.use(player, enemy);
                actionIsDone = true;
                break;
            }
        }
        return actionIsDone;
    }

    private static boolean moveToEnemy(AbstractCreature player, AbstractCreature enemy) {
        int playerPosition = GameMap.findCreatureCell(player);
        int enemyPosition = GameMap.findCreatureCell(enemy);

        int positiveOrNegative = -1;
        if (playerPosition - enemyPosition < 0) positiveOrNegative = 1;
        int distance = player.ActualSpeed * positiveOrNegative;

        do {
            if (GameMap.moveCreature(player, playerPosition + distance)) return true;
            else distance = distance + positiveOrNegative;
        } while (distance != 0);
        return false;
    }


}


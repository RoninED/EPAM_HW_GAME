import creatures.utils.AbstractCreature;
import creatures.utils.DataOfCreatures;
import gamePlay.GameMap;

public class Main {
    public static void main(String[] args) {


        gamePlay();



    }

    static void gamePlay(){
        System.out.println("Player 1, choose you fighter!!!");
        AbstractCreature Player1Creature = DataOfCreatures.heroFactory();
        GameMap.setCreatureToCell(Player1Creature, 2);

        System.out.println(Player1Creature.ID);
        System.out.println("Player 2, choose you fighter!!!");
        AbstractCreature Player2Creature = DataOfCreatures.heroFactory();
        GameMap.setCreatureToCell(Player2Creature, 9);

        DataOfCreatures.printListOfCreatures();


        GameMap.printMap();
    }
}

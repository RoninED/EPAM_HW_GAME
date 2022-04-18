package creatures.utils;

import creatures.classesOfCreatures.OrcKnight;

import java.util.LinkedList;
import java.util.Scanner;

abstract class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static AbstractCreature creatureFactory(String name, int ID) {
        AbstractCreature creature = null;


        while (creature == null) {

            System.out.println("Choose hero" +
                    "\n 1 - Orc Knight"

            );

            switch (scanner.nextInt()) {
                case 1 -> {
                    return new OrcKnight(name, ID);
                }
                default -> System.out.println("The hero is not too famous for us, choose from list");
            }
        }
        return creature;
    }
}

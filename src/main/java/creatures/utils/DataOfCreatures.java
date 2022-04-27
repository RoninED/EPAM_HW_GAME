package creatures.utils;

import creatures.classesOfCreatures.OrcKnight;

import java.util.HashMap;
import java.util.Scanner;




/**
 * Contain information about exist creatures
 */
abstract public class DataOfCreatures {
    public static HashMap<Integer, AbstractCreature> creatures = new HashMap<>();


    public static void heroFactory() {
        Scanner scanner = new Scanner(System.in);

        AbstractCreature newCreature = null;

        int ID = getNewIdForCreature();

        System.out.println("Enter Name of creature");
        String name = scanner.nextLine();

        while (newCreature == null) {
            System.out.println(
                    "List of heroes: " +
                            "\n1 - Ork knight" +
                            "\nchoose one by press numeric key"
            );
            switch (scanner.nextInt()) {
                case 1 -> {
                    newCreature = new OrcKnight(name,ID);
                    creatures.put(ID, newCreature);
                }
                default -> System.out.println("\nwrong number\n");
            }
        }
    }


    private static int getNewIdForCreature() {
        if (creatures == null) return 0;
        else return creatures.keySet().stream()
                .mapToInt(n -> n).max().orElse(-1) + 1;
    }
}

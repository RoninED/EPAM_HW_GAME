package creatures.utils;

import creatures.classesOfCreatures.OrcKnight;

import java.util.HashMap;

import static creatures.utils.Utils.scanner;


/**
 * Contain information about exist creatures
 */
abstract public class DataOfCreatures {
    static HashMap<Integer, AbstractCreature> creatures;


    public static AbstractCreature heroChoosing() {
        AbstractCreature abstractCreature = null;

        System.out.println("Enter Name of creature");
        String name = scanner.nextLine();



        while (abstractCreature != null) {
            System.out.println(
                    "List of heroes: " +
                            "\n1 - Ork knight" +
                            "choose one by press numeric key"
            );
            switch (scanner.nextInt()) {
                case 1 -> abstractCreature = new OrcKnight(name, getNewIDforCreature());
                default -> System.out.println("wrong number");

            }

        }
    }

    public static int getNewIDforCreature() {
        if (creatures == null) return 0;
        else return creatures.keySet().stream()
                .mapToInt(n -> n).max().orElse(-1) + 1;
    }
}

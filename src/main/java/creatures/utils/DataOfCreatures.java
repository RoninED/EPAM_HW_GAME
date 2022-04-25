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
        AbstractCreature returnCreature = null;

        System.out.println("Enter Name of creature");
        String name = scanner.nextLine();



        while (returnCreature == null) {
            System.out.println(
                    "List of heroes: " +
                            "\n1 - Ork knight" +
                            "choose one by press numeric key"
            );
            switch (scanner.nextInt()) {
                case 1 -> returnCreature = new OrcKnight(name, getNewIDforCreature());
                default -> System.out.println("wrong number");

            }

        }
        return returnCreature;
    }

    public static int getNewIDforCreature() {
        if (creatures == null) return 0;
        else return creatures.keySet().stream()
                .mapToInt(n -> n).max().orElse(-1) + 1;
    }
}

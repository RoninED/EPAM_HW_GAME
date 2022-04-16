import creatures.OrcKnight;
import map.Map;

public class Main {
    public static void main(String[] args) {
        OrcKnight orcPetr = new OrcKnight("Petr");
        AT.pr();
    }
}
abstract class AT{
    static void pr(){
        System.out.println("it work");
    }
}


import java.util.*;

public class App{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

      //  System.out.println("")

        CreatureClass issaCreature = new CreatureClass("issa","a very fun human", 22, 0);
        CreatureClass obj = new CreatureClass();

         System.out.println(issaCreature.toString());
        // System.out.println(issaCreature.getName());  
        // System.out.println(obj.toString());  

        Player noName = new Player(10);
        Player p1 = new Player("p1", "a very strong mage", 100, 0, 10);
        System.out.println(noName.toString());
        System.out.println(p1.toString());

        Player p2 = new Player();

        System.out.println(p2.toString());

        Monster zombie = new Monster("zombie", "an undead horror", 20, 0, 10 );
        System.out.println(zombie.toString());
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Game{
    public Player player;
    public Dungeon Room[];

    public Game() throws FileNotFoundException{
        //getting errors with reading from a txt file. and printing ?

        Room[] dungeon = new Room[0];
        File file = new File("/Users/marmar897/Desktop/Java /1st project/textAdventureGame/file_playerInfo.txt");
        Scanner scan = new Scanner(file);
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);

        //creates player1 
        while(scan.hasNext()){
            //System.out.println(scan.nextLine());
            String name = scan.nextLine();
            String description = scan.nextLine();
            int hitPoints = scan.nextInt();
            int damage = scan.nextInt();
            int healAmount = scan.nextInt();

            Player p1 = new Player(name,description,hitPoints,damage,healAmount);
          //  System.out.println(p1.toString());
            String p1String = p1.toString();
            out.println(p1String);
        }

        //constuct 3 monsters:)
        Monster zombie = new Monster("zombie", "an undead horror", 20, 0, 10 );
        System.out.println(zombie.toString());
        Monster zombie2 = new Monster("zombie", "an undead horror", 20, 0, 10 );
        System.out.println(zombie.toString());
        Monster zombie3 = new Monster("zombie", "an undead horror", 20, 0, 10 );
        System.out.println(zombie.toString());
        // construct 3 rooms
        Room room1 = new Room(0, "room with an unbareable smell",zombie);
        Room room2 = new Room(1, "dark and cold",zombie2);
        Room room3 = new Room(2, "A giant hall with something shiny on the other end",zombie3);
        //populating the dungeon array with rooms
        dungeon[0] = room1;
        dungeon[1] = room2;
        dungeon[2] = room3;
    }
    public void play(){
        
    }

    public static void main(String[] args) throws Exception {
        Game();
    }
    private static void Game() {
    }

}

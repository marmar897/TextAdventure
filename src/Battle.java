import java.util.*;

public class Battle {
    Scanner input = new Scanner(System.in);
    private Player player;
    private Monster monster;

    public Battle(){
        
    }

    public Battle(Player player, Monster monster){
        this.monster = monster;
        this.player = player;
    }

    public void run(){
        System.out.println("Battle begins: " + player.getName() + " V.S " + monster.getName());

        }
    //this is a helper method that will be in run method
    public void playerTurn(){
        
        System.out.println("It is now " + player.getName()+ "'s  turn!");
        System.out.println(player.getName() +" has " +player.getHitPoints() + "hitpoints!" );
        System.out.println("Would you like to heal (a) or attack (b)?");

        //somehow take in input from user here :)
    }
    //this is a helper method that will be in run method
    public void monsterTurn(){
 
    }



}

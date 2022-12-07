public class Player extends CreatureClass {
    public int healAmount;

    public Player(String name, String description, int hitPoints, int damage,int healAmount){
        super();
        this.name = name;
        this.description = description;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.healAmount = healAmount;
    }
    public Player(){
        super();
        this.healAmount = 0;
    }

    public Player(int healAmount){
        super();
        this.healAmount = healAmount;
    }

    public void heal(){
        this.hitPoints = hitPoints + healAmount;
        System.out.println(getName() + " has healed by " + healAmount );
        System.out.println( "HP is now" + hitPoints );
    }
    public String toString(){
        return name +" "+ description + " has a current hp of " + hitPoints + " and can heal by " + healAmount;
    }
    
}

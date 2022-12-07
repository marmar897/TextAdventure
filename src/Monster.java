public class Monster extends CreatureClass{
    private int threshold;
    private boolean enrage;
    
    public Monster(){
        super();
        this.threshold = 0;
    }
    public Monster(int threshold){
        super();
        this.threshold = threshold;
    }
    public Monster(String name, String description, int hitPoints, int damage, int threshold){
        super();
        this.name = name;
        this.description = description;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.threshold = threshold;
    }

    public boolean canEnrage(){
        return (hitPoints <= threshold);
    }

    public void doubleDamage(){
        if (canEnrage()){
            this.damage = damage * 2;
            System.out.println("I am enraged now! I have doubled my attack damage");
        }
    }




}

public class CreatureClass {
    protected String name, description;
    protected int hitPoints;
    protected int damage;

    public CreatureClass(){
        name = "noName";
        description = "";
        hitPoints = 0;
        damage = 0;
    }

    public CreatureClass(String name, String description, int hitPoints, int damage){
        this.name = name;
        this.description = description;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }
    public void attack(){
        System.out.println(name + "has attacked! ");
    }
    public void takeDamage(){
        System.out.println(name + "has been attacked!");
        this.damage = damage - 5;
    }

    public boolean isAlive(){
        if(hitPoints <= 0 ){
            return false;
        } else{
            return true;
        }
    }   
    public String toString(){
        return name +", "+ description + ", has a current hp of " + hitPoints;
    }
public String getName(){
    return this.name;
}






}

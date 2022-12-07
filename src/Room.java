public class Room {
    protected int roomIndex;
    protected String description;
    protected Monster monster;

    public Room(){
        roomIndex = 0; 
        description = "";
        monster = null;
    }

    public Room (int roomIndex, String description, Monster monster){
        this.roomIndex = roomIndex;
        this.description = description;
        this.monster = monster;  
    }


}
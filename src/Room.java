public class Room {
    protected int roomIndex;
    protected String description;
    protected Monster monster;

    public Room(){
        roomIndex = 0; 
        description = "";
    }

    public Room (int roomIndex, String description, Monster monter){
        this.roomIndex = roomIndex;
        this.description = description;
        this.monster = monster;  
    }





}
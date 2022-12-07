public class TreasureRoom extends Room {
    protected String treasure;

    public TreasureRoom(){
        super();
        this.treasure = "";
    }

    public TreasureRoom(int roomIndex, String description, Monster monster, String treasure){
        super();
        this.roomIndex = roomIndex;
        this.description = description;
        this.monster = monster;
        this.treasure = treasure;
    }
}
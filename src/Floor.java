import java.util.*;
public class Floor{
    //Stack currentFloor = new Stack<>();
    //Current floor will be either 1, 2 or 3
    int currentFloor;
    public Floor(){
        this.currentFloor = 1;
    }
    
    public int getFloor() {
        return this.currentFloor;
    }
    public void setFloor(int floor) {
        this.currentFloor = floor;
    }
    
    

}
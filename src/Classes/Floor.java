package Classes;

public class Floor{
    private int currentFloor;
    
    public Floor() {
        this.currentFloor = 1;
    }
    
    public int getFloor() {
        return this.currentFloor;
    }
    public void setFloor(int floor) {
        this.currentFloor = floor;
    }

}
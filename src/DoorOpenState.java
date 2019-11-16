public class DoorOpenState implements DoorState {
    
    public void doAction(Door door) {
        //System.out.println("Doors are open");
        door.setDoorState(this);
    }

    public String toString() {
        return "Doors are open";
    }
}
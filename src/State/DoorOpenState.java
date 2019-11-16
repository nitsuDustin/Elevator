package State;
import Classes.*;

public class DoorOpenState implements DoorState {
    
    public void doAction(Door door) {
        door.setDoorState(this);
    }

    public String toString() {
        return "Doors are open";
    }
}
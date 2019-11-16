package State;
import Classes.*;

public class DoorClosedState implements DoorState {

    public void doAction(Door door) {
        door.setDoorState(this);
    }

    public String toString() {
        return "Doors are closed";
    }
}
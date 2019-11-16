package State;
import Classes.*;

public class DoorClosedState implements DoorState {

    public void doAction(Door door) {
        //System.out.println("Doors are closed");
        door.setDoorState(this);
    }

    public String toString() {
        return "Doors are closed";
    }
}
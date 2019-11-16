package Classes;
import State.*;

public class Door {
    private DoorState state;
    
    public Door() {
        state = new DoorOpenState();
    }

    public void setDoorState(DoorState state) {
        this.state = state;
    }

    public DoorState getDoorState() {
        return state;
    }

    public String toString() {
        return state.toString();
    }
}
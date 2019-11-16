public class Door implements Mediator{
    private DoorState state;
    
    public Door() {
        state = new DoorOpenState();
    }

    // Most likely not needed. Also why in this class? Shouldnt it be in floor?
    @Override
    public boolean checkFloor(int destination, int current) {
        //True = different floor so, print the *ding* The elevator arrived at floor __
        //False = same floor so, print "Doors closed nothing happened"
        if(destination == current)
            return false;
        else
            return true;
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
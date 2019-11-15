import java.util.*;
public class Door implements Mediator{
    //This will be called in the Elevator class
    //destination will be floor.getFloor()
    //current will be currentFloor
    
    /* Open or closed variable? */
    @Override
    public boolean checkFloor(int destination, int current) {
        //True = different floor so, print the *ding* The elevator arrived at floor __
        //False = same floor so, print "Doors closed nothing happened"
        if(destination == current)
            return false;
        else
            return true;
    }
}
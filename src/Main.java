import State.*;
import Classes.*;
public class Main{
    public static void main(String args[]){
        Elevator elevator = new Elevator();
        elevator.press2();
        elevator.press1();
        elevator.press3();
        elevator.press3();
        elevator.press1();


        System.out.println("\nTesting the state of the door");
        Door door = new Door();
        
        DoorOpenState open = new DoorOpenState();
        open.doAction(door);
        System.out.println(door.toString());

        DoorClosedState close = new DoorClosedState();
        close.doAction(door);
        System.out.println(door.toString());

    }
}
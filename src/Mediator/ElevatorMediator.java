package Mediator;
import Classes.*;
import State.*;

public class ElevatorMediator implements Mediator {
    private Floor floor;
    private Door door;
    private DoorState state;

    public ElevatorMediator() {
        this.floor = new Floor();
        this.door = new Door();
        this.state = null;
    }

    public void press(int newFloor) {
        if (newFloor == floor.getFloor()) {
            System.out.println("Nothing happens");
        } else {
            System.out.println(newFloor + " pressed");
            onClose();
            goingUpOrDown(newFloor);
            floor.setFloor(newFloor);
            System.out.println("*ding* The elevator arrives at Floor " + String.valueOf(floor.getFloor()));
            onOpen();
        }
    }

    public void onClose() {
        state = new DoorOpenState();
        state.doAction(door);
        System.out.println(door.toString());
    }

    public void onOpen() {
        state = new DoorOpenState();
        state.doAction(door);
        System.out.println(door.toString());
    }

    public void goingUpOrDown(int newFloor) {
        if (newFloor > floor.getFloor()) {
            System.out.println("Going up...");
        } else {
            System.out.println("Going down...");
        }
    }

    public Floor getFloor() {
        return floor;
    } 

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public DoorState getDoorState() {
        return state;
    }

    public void setDoorState(DoorState state) {
        this.state = state;
    }
}
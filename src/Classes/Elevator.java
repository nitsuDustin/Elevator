package Classes;
import State.*;
import Mediator.*;

public class Elevator implements FloorState{
    private Mediator mediator;

    public Elevator() {
        this.mediator = new ElevatorMediator();
    }

    public void press1() {
        buttonPress(1);
    }

    public void press2() {
        buttonPress(2);
    }

    public void press3() {
        buttonPress(3);
    }

    public void buttonPress(int newFloor) {
        mediator.press(newFloor);
    }
}
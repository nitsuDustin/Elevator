public class Elevator implements FloorState{
    private Med mediator;

    public Elevator() {
        this.mediator = new Med();
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
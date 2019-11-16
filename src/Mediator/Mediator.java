package Mediator;

public interface Mediator{
    public void press(int newFloor);
    public void onClose();
    public void onOpen();
    public void goingUpOrDown(int newFloor);
}

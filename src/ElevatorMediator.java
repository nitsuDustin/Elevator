public class ElevatorMediator implements Mediator {
    private Floor floor;
    private Door door;
    private DoorOpenState open;
    private DoorClosedState close;

    public ElevatorMediator() {
        this.floor = new Floor();
        this.door = new Door();
        this.open = new DoorOpenState();
        this.close = new DoorClosedState();
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
        close.doAction(door);
        System.out.println(door.toString());
    }

    public void onOpen() {
        open.doAction(door);
        System.out.println(door.toString());
    }

    public void goingUpOrDown(int newFloor) {
        if (newFloor > floor.getFloor()) {
            System.out.println("Going up...");
        } else {
            System.out.println("Going down...");
        }
    }
}
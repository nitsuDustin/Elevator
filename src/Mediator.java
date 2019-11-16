public interface Mediator{
    //True == same floor so, print the *ding* The elevator arrived at floor __
    //False == different floor so, print "Doors closed nothing happened"
    //public boolean checkFloor(int destination, int current);

    public void press(int newFloor);
    public void onClose();
    public void onOpen();
    public void goingUpOrDown(int newFloor);
}

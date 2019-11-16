public interface Mediator{
    //True == same floor so, print the *ding* The elevator arrived at floor __
    //False == different floor so, print "Doors closed nothing happened"
    public boolean checkFloor(int destination, int current);
    //TODO:Create function to check the floor and print whether going up or going down

}

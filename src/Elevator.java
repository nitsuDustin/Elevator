import java.util.*;

public class Elevator implements FloorState{
    private Floor floor;// = new Floor();
    private Door door;
    int currentFloor;
    public Elevator(){
        this.floor = new Floor();
        this.door = new Door();
        currentFloor = 1;
    }

    public void press1(){
        //buttonPress(1);
        System.out.println("1 pressed");
        floor.setFloor(1);
        printElevator();
        this.currentFloor = 1;
        //return this.currentFloor = 1;
    }
    public void press2(){
        //buttonPress(2);
        System.out.println("2 pressed");
        floor.setFloor(2);
        printElevator();
        this.currentFloor = 2;
        //return this.currentFloor = 2;
    }
    public void press3(){
        //buttonPress(3);
        System.out.println("3 pressed");
        floor.setFloor(3);
        printElevator();
        this.currentFloor = 3;
        //return this.currentFloor = 3;
    }

    public buttonPress(int newFloor) {
        System.out.println(newFloor + " pressed");
        floor.setFloor(newFloor);
        printElevator();
        this.currentFloor(newFloor);
        //return this.currentFloor = newFloor;
    }

    public void printElevator(){
        //TODO:Check current floor
        boolean check = door.checkFloor(floor.getFloor(), currentFloor);
        if(check == true){
            System.out.println("*ding* The elevator arrives at Floor " + String.valueOf(floor.getFloor()) + "\nDoors are open");
        }
        if(check == false){
            System.out.println("Doors are closed\nNothing happens");
        }
    }
}
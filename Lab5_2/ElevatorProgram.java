package Lab5_2;

public class ElevatorProgram {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(3);
        Elevator elevator2 = new Elevator();

        elevator1.openDoors();
        elevator1.closeDoors();
        elevator1.goToFloor(2);
        elevator1.goingUp();
        elevator1.goingDown();

        elevator2.openDoors();
        elevator2.closeDoors();
        elevator2.goToFloor(6);
        elevator2.goingUp();
        elevator2.goingDown();
    }
}

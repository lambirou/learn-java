package Lab5_1;

public class Elevator {
    int currentLevel;
    int nextLevel;
    boolean doorStatus;
    boolean moving;

    public void goToFloor(int level) {
        System.out.println("Set nextLevel attribut to: " + level);
        this.nextLevel = level;
    }

    public void openDoors() {
        System.out.println("Set doorStatus attribut to: true");
        this.doorStatus = true;
    }

    public void closeDoors() {
        System.out.println("Set doorStatus attribut to: false");
        this.doorStatus = false;
    }

    public void goingUp() {
        System.out.println("Set moving attribut to: true");
        this.moving = true;
    }

    public void goingDown() {
        System.out.println("Set moving attribut to: false");
        this.moving = false;
    }
}

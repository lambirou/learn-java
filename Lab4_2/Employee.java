package Lab4_2;

import java.util.ArrayList;

public class Employee {
    int id;
    String name;
    ArrayList<Goodies> goodies;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.goodies = new ArrayList<>();
    }

    public void addGoodies(Goodies goodies) {
        this.goodies.add(goodies);
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", goodies=" + goodies.size() +
                '}';
    }
}

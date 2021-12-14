package Lab4_1;

enum GoodiesType {
    CANDY,
    POPCORN
}

public class Goodies {
    GoodiesType type;
    int id;

    public Goodies(int id, GoodiesType type) {
        this.id = id;
        this.type = type;
    }

    public String toString() {
        return "Goodies{" +
                "type=" + type +
                ", id=" + id +
                '}';
    }
}

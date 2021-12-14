package Lab4_1;

enum MovieType {
    DVD,
    VHS,
}

public class Movie {
    int id;
    String title;
    MovieType type;

    public Movie(int id, String title, MovieType type) {
        this.set(id, title, type);
    }

    public void set(int id, String title, MovieType type) {
        this.id = id;
        this.type = type;
        this.title = title;
    }

    public String toString() {
        return "Movie{" + id + "title='" + title + '\'' + ", type=" + type + '}';
    }
}

package Recursive;

class Category {
    private int items;
    public Categories subs = new Categories();

    Category() {
        items = 0;
    }

    Category(int nb) {
        items = nb;
    }

    public int all() {
        return items;
    }
}
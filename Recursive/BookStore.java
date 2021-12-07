package Recursive;

public class BookStore {
    protected static Categories categories;

    public static void main(String[] args) {
        Category c1 = new Category(3);
        Category c2 = new Category(2);
        Category c3 = new Category(10);
        Category c4 = new Category();
        Category c5 = new Category(4);

        Categories subc1 = new Categories();
        subc1.add(c3);

        c1.subs = subc1;

        categories = new Categories();
        categories.add(c1);
        categories.add(c2);
        categories.add(c4);
        categories.add(c5);

        int total = count(BookStore.categories);
        System.out.println("The bookstore has " + total + " books");
    }

    // Définissez une fonction récursive
    private static int count(Categories categories) {
        int c = 0;

        for (Category category : categories) {
            c += category.all();
            c += count(category.subs);
        }

        return c;
    }
}

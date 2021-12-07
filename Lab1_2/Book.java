package Lab1_2;

public class Book {
    public static void main(String[] args) {
        BookItem book = new BookItem();

        book.setTitle(args[0]);
        book.setAuthor(args[2]);
        book.setPrice(Integer.parseInt(args[1]));

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}

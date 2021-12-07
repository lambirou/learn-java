package Lab1_2;

public class BookItem {
    private String title;
    private String author;
    private Integer price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

package pl.akademiakodu.helloSpring.model;

/**
 * Created by user on 27.07.2017.
 */
public class Book {
    private String author;
    private String title;
    private Double price;

    public Book(String author, String title, Double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public Book() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return getTitle()+" "+getAuthor()+" "+getPrice();
    }
}

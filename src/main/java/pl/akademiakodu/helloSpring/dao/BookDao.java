package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 27.07.2017.
 */
public class BookDao {
    public static List<Book> findAll(){
        List<Book> books = new ArrayList<>();
        for (int i=1; i<=6;i++){
            books.add(new Book("Author"+i,"Książka"+i,52.23));
        }
        return books;
    }
}

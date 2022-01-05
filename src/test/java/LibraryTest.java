import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        library = new Library("RP Bookstore",2);
        book = new Book("Slaughterhouse Five", "Kurt Vonnegut", "Fiction");
//        book1 = new Book("Years of the Locust", "Jon Hotten", "Sport/Boxing");
//        book2 = new Book("American Psycho", "Brett Easton-Ellis", "Fiction");
//        book3 = new Book("The Killings of Stanley Ketchel", "James Carlos Blake", "Fiction");
    }

    @Test
    public void canAddStock() {
        library.addStock(book);
        assertEquals(1,library.stockCount());
    }

    @Test
    public void cantAddStock() {
        library.addStock(book);
        library.addStock(book1);
        library.addStock(book2);
        assertEquals(2,library.stockCount());
    }
}

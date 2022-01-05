import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("Slaughterhouse Five", "Kurt Vonnegut", "Fiction");
    }

    @Test
    public void bookHasName() {
        assertEquals("Slaughterhouse Five", book.getName());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Kurt Vonnegut", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fiction", book.getGenre());
    }

}

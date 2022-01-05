import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> collection;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();

    }

    public ArrayList<Book> getBooks(){
        return collection;
    }

    public int stockCount() {
        return this.collection.size();
    };

    public void addStock(Book book) {
        if (this.stockCount() < this.capacity) {
            this.collection.add(book);
        }
    }

}


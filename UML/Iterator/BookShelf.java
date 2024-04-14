import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> list ;

    public BookShelf(int initialsize) {
        this.list = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) {
        return list.get(index);
    }

    public void appendBook(Book book) {
        list.add(book);
    }

    public int getLength() {
        return list.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}

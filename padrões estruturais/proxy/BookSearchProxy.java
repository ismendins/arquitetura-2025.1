import java.util.ArrayList;
import java.util.List;

public class BookSearchProxy {
    private BookSearch bs;
    private List<Book> cache;

    public BookSearchProxy(){
        this.bs = new BookSearch();
        this.cache = new ArrayList<Book>();
    }

    public BookSearchProxy(BookSearch bs) {
        this.bs = bs;
    }



    public Book getBook(String isbn){
        for (Book bk : cache){
            if (bk.getIsbn().equals(isbn)){
                return bk;
            }
        }
        Book result = bs.getBook(isbn);
        if (result != null){
            cache.add(result);
        }
        System.out.println("Proxy");
        return result;
    }
}

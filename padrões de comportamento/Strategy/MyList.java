import java.util.ArrayList;
import java.util.List;

public class MyList {
    // estrutura de dados
    private List myList;
    // métodos relacionados: add, remove, get, size, isEmpty, clear, cont
    private SortStrategy strategy;

    public MyList(){
        this.myList = new ArrayList<Integer>();
        this.strategy = new QuickSortStrategy();
    }

    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(){
        this.strategy.sort(this);
    }
}

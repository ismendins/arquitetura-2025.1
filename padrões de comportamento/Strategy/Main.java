public class Main {
    public static void main (String[] args){
        MyList list = new MyList();

        list.sort();

        SortStrategy shell = new ShellSortStrategy();
        list.setStrategy(shell);

        list.sort();

    }
}

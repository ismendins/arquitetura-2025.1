public class App{
    public static void main(String[] args) throws Exception {
        BookSearch bs = new BookSearch();
        BookSearchProxy bsp = new BookSearchProxy(bs);

        try {
            System.out.println(bs.getBook("SADJEF23823").getNome());
            System.out.println(bs.getBook("SADJEF23823").getNome());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class BookSearch {
    private Book b1 = new Book("Clean Code", "Roberto", "SADJEF23823");
    private Book b2 = new Book("Java - Como programar", "Deitell", "4364VDSG");

    public Book getBook(String isbn){
        System.out.println("Search");
        if (isbn.equals("SADJEF23823")){
            return this.b1;
        } else if ((isbn.equals("4364VDSG"))) {
            return this.b2;
        } else {
            return null;
        }
    }
}

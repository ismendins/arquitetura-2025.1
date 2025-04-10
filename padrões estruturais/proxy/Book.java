public class Book {
    private String nome;
    private String autor;
    private String isbn;

    public Book (String nome, String autor, String isbn){
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

  
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getAutor() {
        return autor;
    }

 
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}

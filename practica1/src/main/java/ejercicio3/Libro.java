package ejercicio3;

public class Libro {
    String title;
    String author;
    String editorial;
    int year;
    int ISBN;

    public Libro(String title, String author, String editorial, int year, int ISBN){
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString(); /*TODO example :
                                        Titulo = Thinking in Java
                                        Autores = Bruce Eckel
                                        Editorial = Prentice Hall
                                        Año = 2007
                                        Isbn = 0131872486*/

    }

    
}

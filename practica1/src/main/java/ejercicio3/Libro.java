package ejercicio3;

public class Libro {
    String title;
    String author;
    String editorial;
    int year;
    double ISBN;

    public Libro(String title, String author, String editorial, int year, double ISBN){
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Titulo = " + this.title + "\nAutores = " + this.author + "\nEditorial = " + this.editorial + "\nAño = " + this.year + "\nISBN = " + this.ISBN; /*TODO example :
                                        Titulo = Thinking in Java
                                        Autores = Bruce Eckel
                                        Editorial = Prentice Hall
                                        Año = 2007
                                        Isbn = 0131872486*/

    }

    
}

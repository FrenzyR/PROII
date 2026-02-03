package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Punto puntoUno = new Punto(3, 4);
        Punto puntoDos = new Punto(0, 0);
        System.out.println(puntoUno);
        System.out.println(puntoUno.distanciaAlOrigen());
        System.out.println(puntoDos.distanciaAlOrigen());
    }
}
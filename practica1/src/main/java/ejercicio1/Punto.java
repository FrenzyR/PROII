package ejercicio1;

public class Punto {

    double x;
    double y;
    Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    double distanciaAlOrigen(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    @Override
    public String toString() {
        return "(X: " + this.x + " Y: " + this.y + ")";
    }

    

}

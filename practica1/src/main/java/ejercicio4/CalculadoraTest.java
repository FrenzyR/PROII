package ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora();
    int resultado;
    double resultadoDecimal;

    @Test
    void testSumar() {

        this.resultado = this.calc.sumar(2, 3);

        assertEquals(5, resultado);
    }

    @Test
    void testSumarTresInt(){
        this.resultado = this.calc.sumar(2,3,4);
        assertEquals(9,resultado);
    }

    @Test
    void testSumarDecimales(){
        this.resultadoDecimal = this.calc.sumar(5.2, 3.6);
        assertEquals(8.8, resultadoDecimal);
    }

    @Test
    void testMultiplicacion(){
        this.resultado = this.calc.multiplicar(2,5);
        assertEquals(10, resultado);
    }

    @Test
    void testMultiplicacionUnDecimal(){
        this.resultadoDecimal = this.calc.multiplicar(2,5.0);
        assertEquals(10.0, resultadoDecimal);
    }
}

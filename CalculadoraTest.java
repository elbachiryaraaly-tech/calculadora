import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(6, 3), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirEntreCero() {
        calc.dividir(5, 0);
    }
}  
}

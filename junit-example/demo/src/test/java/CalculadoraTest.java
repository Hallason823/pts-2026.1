import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Calculadora;

class CalculadoraTest {

    int VALUES[] = {3, 5};
    Calculadora c;

    @BeforeEach
    public void setup() {
        this.c = new Calculadora();
    } 

    @Test
    public void somaTest() {
        assertEquals(8, c.somar(VALUES[0], VALUES[1]));        
    }

    @Test
    public void subTest() {
        assertEquals(-2, c.subtrair(VALUES[0], VALUES[1]));
    }

    @Test
    public void multTest() {
        assertEquals(15, c.multiplicar(VALUES[0], VALUES[1]));
    }

    @Test
    public void divTest() {
        assumeTrue(VALUES[1] != 0);
        assertEquals(0.6, c.dividir(VALUES[0], VALUES[1]));
    }

    @Test
    public void divZeroTest() {
        int specialValues[] = {4, 0};
        assumeTrue(specialValues[1] == 0);
        assertThrows(IllegalArgumentException.class, () -> {
            c.dividir(specialValues[0], specialValues[1]);
        });
    }
}
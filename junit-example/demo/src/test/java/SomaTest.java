import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Soma;

public class SomaTest {

    @Test
    public void operacaoTest(){
        Soma s = new Soma(3, 5);
        int resultado = s.operacao();
        assertEquals(8, resultado);
    }

    @Test
    public void helloTest(){
        Soma s = new Soma(2,3);
        assertEquals("Hello World!", s.hello());
    }
    
}
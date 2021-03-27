import setup.Webdriver;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import page.CalculadoraPage;

public class CalculadoraTest extends Webdriver{

    @Test
    public void soma(){
        CalculadoraPage calPage = new CalculadoraPage(driver);
        Integer resultado = calPage.sumNumber(5, 7);
        assertEquals(12, resultado);
    }

}


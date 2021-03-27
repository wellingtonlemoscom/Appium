import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import page.HomePage;
import page.LoginPage;
import setup.Webdriver;

import java.util.concurrent.TimeUnit;

public class HackerNewsTest extends Webdriver {

    @Test
    public void loginVazioTest(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        HomePage hpage = new HomePage(driver);
        LoginPage lpage = new LoginPage(driver);

        hpage.accessLogin();
        String msg = lpage.loginVazio();
        assertEquals("Catch you, anonymous!", msg);
    }
}

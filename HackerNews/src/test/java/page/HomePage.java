package page;

import attributes.HomeAttributes;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends HomeAttributes {

    public AndroidDriver driver;

    public HomePage(AndroidDriver driver){
        this.driver = driver;
    }

    public void accessLogin(){
        driver.findElement(menu).click();
        driver.findElement(expander).click();
        driver.findElement(login).click();
    }

}

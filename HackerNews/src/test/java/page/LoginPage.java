package page;

import attributes.LoginAttributes;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPage extends LoginAttributes {

    public AndroidDriver driver;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
    }

    public String loginVazio(){
        driver.findElementById(bt_login).click();
        return  driver.findElement(msg_error).getText();
    }
}

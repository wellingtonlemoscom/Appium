package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.concurrent.TimeUnit;

public class CalculadoraPage{

    public AndroidDriver driver;

    public CalculadoraPage(AndroidDriver driver){
        this.driver = driver;
    }

    public void clickNumber(Integer num){
        MobileElement number = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_" + num);
        number.click();
    }

    public void clickPlus(){
        MobileElement plus = (MobileElement) driver.findElementByAccessibilityId("plus");
        plus.click();
    }

    public void clickEqual(){
        MobileElement equals = (MobileElement) driver.findElementByAccessibilityId("equals");
        equals.click();
    }

    public String getResult(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement result = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        return  result.getText();
    }

    public Integer sumNumber(Integer num1, Integer num2){
        clickNumber(num1);
        clickPlus();
        clickNumber(num2);
        clickEqual();
        Integer num3 = Integer.parseInt(getResult());
        return num3;
    }


}

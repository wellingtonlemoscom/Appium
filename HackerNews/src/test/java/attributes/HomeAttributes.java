package attributes;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class HomeAttributes {

    public static MobileBy menu = (MobileBy) MobileBy.AccessibilityId("Navigate up");
    public static By expander = (By) MobileBy.id("iv_expander");
    public static By login = (By) MobileBy.id("design_menu_item_text");

}

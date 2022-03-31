package helpers;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.Cookie;
import webdrivers.Driver;

@UtilityClass
public class CookieHelper implements Driver {

    public static void allowAllCookies() {
        Cookie cookie = new Cookie("CookieConsent", "{stamp:%27+9ZTxVSZwNNeeJcQP35WfkUQSFFr4RRekoE4JK7EWo59SbjAxhQSbw==%27%2Cnecessary:true%2Cpreferences:false%2Cstatistics:false%2Cmarketing:false%2Cver:1%2Cutc:1648627415923%2Cregion:%27pl%27}");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }

}

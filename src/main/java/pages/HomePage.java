package pages;

import helpers.CookieHelper;
import org.junit.jupiter.api.Assertions;
import webdrivers.Driver;

public class HomePage implements Driver {

    public void goToHomePage() {
        driver.navigate().to("https://omadaidentity.com/");
        CookieHelper.allowAllCookies();
    }

    public void shouldHaveCorrectPageTitle() {
        Assertions.assertEquals(driver.getTitle(), "Identity Governance Solutions Simplified | Omada Identity");
    }
}

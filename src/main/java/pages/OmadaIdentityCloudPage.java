package pages;

import helpers.Waits;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import webdrivers.Driver;

import java.time.Duration;

public class OmadaIdentityCloudPage implements Driver {

    private final By benefits = By.cssSelector(".m-benefits");
    private final By heroImageTitle = By.linkText("Omada Identity Cloud");

    public void pageIsLoaded() {
        Waits waits = new Waits();
        waits.waitForPageLoadComplete(driver, Duration.ofSeconds(2));

        Assertions.assertAll(
                () -> Assertions.assertTrue(driver.findElement(benefits).isDisplayed()),
                () -> Assertions.assertTrue(driver.findElement(heroImageTitle).isDisplayed())
        );
    }

}

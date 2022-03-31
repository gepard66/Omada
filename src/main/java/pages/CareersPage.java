package pages;

import components.CareersButtons;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import webdrivers.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class CareersPage implements Driver {

    public void clickButton(CareersButtons section) {
        driver.findElement(section.getButton()).click();
    }

    public void checkIfDataAreCorrect(String employee) {
        By title = By.xpath("//h4[contains(text(),'" + employee + "')]/following-sibling::span");

        By employeeImage = By.cssSelector("[alt='" + employee + "']:not(.headshot)");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(employeeImage)).perform();

        await().atMost(10, TimeUnit.SECONDS)
                .pollInterval(Duration.ofMillis(200))
                .until(() -> driver.findElement(employeeImage).getDomAttribute("class").contains("loaded"));

        String jobTitle = driver.findElement(title).getText();

        driver.findElement(employeeImage).click();

        By boxContentJobTitle = By.cssSelector("[alt='" + employee + "'].headshot ~ div .eyebrow");
        By boxContentEmployeeName = By.cssSelector("[alt='" + employee + "'].headshot ~ div h2");

        Assertions.assertAll(
                () -> Assertions.assertEquals(jobTitle.toUpperCase(), driver.findElement(boxContentJobTitle).getText().toUpperCase()),
                () -> Assertions.assertEquals(employee, driver.findElement(boxContentEmployeeName).getText())
        );
    }
}

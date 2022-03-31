package stepDefinitions;

import helpers.Waits;
import io.cucumber.java.en.And;
import webdrivers.Driver;

import java.time.Duration;

public class GeneralStepDefinitions implements Driver {

    @And("^Page is loaded$")
    public void pageIsLoaded() {
        Waits wait = new Waits();
        wait.waitForPageLoadComplete(driver, Duration.ofSeconds(3));
    }

}

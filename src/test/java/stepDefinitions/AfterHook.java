package stepDefinitions;

import io.cucumber.java.After;
import webdrivers.DriverFactory;

public class AfterHook {

    @After
    public static void tearDown() {
        DriverFactory.CHROME.getDriverManager().quitDriver();
    }

}

package webdrivers;

import org.openqa.selenium.WebDriver;

public interface Driver {
    WebDriver driver = DriverFactory.CHROME.getDriverManager().getDriver();
}

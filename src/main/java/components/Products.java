package components;

import lombok.AllArgsConstructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import webdrivers.Driver;

@AllArgsConstructor
public class Products implements Driver {

    public void goToProductSection(ProductsSubTabs tab) {
        WebElement productTab = driver.findElement(HeaderTabs.PRODUCTS.getTab());
        Actions action = new Actions(driver);
        action.moveToElement(productTab);
        driver.findElement(tab.getProductSubTab()).click();
    }

}

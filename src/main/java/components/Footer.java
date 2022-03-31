package components;

import webdrivers.Driver;

public class Footer implements Driver {

    public void goToSection(FooterSections section) {
        driver.findElement(section.getTab()).click();
    }

}

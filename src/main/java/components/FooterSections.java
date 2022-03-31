package components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.By;

@AllArgsConstructor
@Getter
public enum FooterSections {

    OMADA_IDENTITY_CLOUD(By.id("menu-item-2263")),
    CAREERS(By.cssSelector("#menu-item-747 a"));

    private final By tab;
}

package components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.By;

@AllArgsConstructor
@Getter
public enum HeaderTabs {

    PRODUCTS(By.id("menu-item-727"));

    private final By tab;
}

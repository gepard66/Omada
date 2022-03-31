package components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.By;

@AllArgsConstructor
@Getter
public enum ProductsSubTabs {

    OMADA_IDENTITY_CLOUD(By.linkText("Omada Identity Cloud"));

    private final By productSubTab;
}

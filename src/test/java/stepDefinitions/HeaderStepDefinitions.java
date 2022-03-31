package stepDefinitions;

import components.Products;
import components.ProductsSubTabs;
import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeaderStepDefinitions {

    private final Products products;

    @Given("^I go to (OMADA_IDENTITY_CLOUD|COMPANY) via header$")
    public void iGoToSection(ProductsSubTabs tab) {
        products.goToProductSection(tab);
    }

}

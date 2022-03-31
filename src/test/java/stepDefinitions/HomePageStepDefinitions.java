package stepDefinitions;

import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import pages.HomePage;

@AllArgsConstructor
public class HomePageStepDefinitions {

    private final HomePage homePage;

    @Given("I am on home page")
    public void iAmOnHomePage() {
        homePage.goToHomePage();
        homePage.shouldHaveCorrectPageTitle();
    }

}

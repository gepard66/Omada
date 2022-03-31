package stepDefinitions;

import components.Footer;
import components.FooterSections;
import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FooterStepDefinitions {

    private final Footer footer;

    @Given("^I go to (OMADA_IDENTITY_CLOUD|CAREERS) via footer$")
    public void iGoToSection(FooterSections section) {
        footer.goToSection(section);
    }

}

package stepDefinitions;

import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import pages.OmadaIdentityCloudPage;

@AllArgsConstructor
public class OmadaIdentityCloudStepDefinitions {

    private final OmadaIdentityCloudPage omadaIdentityCloudPage;

    @Then("^I am on OMADA_IDENTITY_CLOUD page$")
    public void iAmOnOmadaIdentityCloudPage() {
        omadaIdentityCloudPage.pageIsLoaded();
    }

}

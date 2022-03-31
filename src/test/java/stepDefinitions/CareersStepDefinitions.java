package stepDefinitions;

import components.CareersButtons;
import components.FooterSections;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import pages.CareersPage;

@AllArgsConstructor
public class CareersStepDefinitions {

    private final CareersPage careersPage;

    @And("^I click (SEARCH_OUR_JOB_OPENINGS|OPEN_JOB_POSITIONS) button$")
    public void iClickButton(CareersButtons button) {
        careersPage.clickButton(button);
    }

    @Then("^Employee data are correct: (.*)$")
    public void employeeDataAreCorrect(String employee) {
        careersPage.checkIfDataAreCorrect(employee);
    }

}

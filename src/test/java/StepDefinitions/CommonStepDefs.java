package StepDefinitions;

import io.cucumber.java.en.Given;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the homepage is open")
    public void theHomepageIsOpen() {
        loginPage.openPage();
    }
}
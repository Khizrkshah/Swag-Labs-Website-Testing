package StepDefinitions;

import io.cucumber.java.en.Given;

/**
 * The class that contains the common step definitions between every feature file.
 */
public class CommonStepDefs extends AbstractStepDefs {

    @Given("the homepage is open")
    public void theHomepageIsOpen() {
        loginPage.openPage();
    }
}
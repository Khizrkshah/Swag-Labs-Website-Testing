package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDefs extends AbstractStepDefs{
    @Given("the {string} is added to the cart")
    public void theItemIsAddedToTheCart() {
    }

    @And("the checkout button is clicked")
    public void theCheckoutButtonIsClicked() {
    }

    @And("the First Name is filled with {string}")
    public void theFirstNameIsFilledWithKhizr() {
    }

    @And("the Last Name is filled with {string}")
    public void theLastNameIsFilledWithShah() {
    }

    @And("the Zip Code is filled with {string}")
    public void theZipCodeIsFilledWith(int arg0) {
    }

    @When("the Continue button is clicked")
    public void theContinueButtonIsClicked() {
    }

    @Then("{string} should be shown")
    public void totalShouldBeShown() {
    }
}

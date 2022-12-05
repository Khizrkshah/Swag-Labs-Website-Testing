package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * The class used to test the login.feature file.
 */
public class LoginStepDefs extends AbstractStepDefs {

    @Given("the Username is filled with {string}")
    public void theUsernameIsFilledWithString(String userName) {
        loginPage.fillField(LoginPage.USERNAME,userName);
    }

    @And("the Password is filled with {string}")
    public void thePasswordIsFilledWithString(String password) {
        loginPage.fillField(LoginPage.PASSWORD,password);
    }

    @When("the Login button is clicked")
    public void theLoginButtonIsClicked() {
        loginPage.clickLoginButton();
        inventoryPage.initializeInventoryPage();
    }


    @Then("an incorrect_login_message is shown")
    public void anIncorrect_login_messageIsShown() {
        Assert.assertEquals(loginPage.getLoginErrorMessage(),"Epic sadface: Username and password do not match any user in this service");
    }

    @Then("the Product page is opened")
    public void theProductPageIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(), InventoryPage.PAGE_URL);
    }

    @Then("a {string} is shown")
    public void aInvalidLoginMessageIsShown(String message) {
        Assert.assertEquals(loginPage.getLoginErrorMessage(),message);
    }

}

package StepDefinitions;

import com.example.softwaretestingproject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    }


    @Then("an incorrect_login_message is shown")
    public void anIncorrect_login_messageIsShown() {
        Assert.assertEquals(loginPage.loginErrorMessage.getText(),"Epic sadface: Username and password do not match any user in this service");
    }

    @Then("the Product page is opened")
    public void theProductPageIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }

    @Then("a {string} is shown")
    public void aInvalidLoginMessageIsShown(String message) {
        Assert.assertEquals(loginPage.loginErrorMessage.getText(),message);
    }

}

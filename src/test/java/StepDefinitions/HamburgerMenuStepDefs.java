package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HamburgerMenuStepDefs extends AbstractStepDefs {

    @Given("the Cart is opened")
    public void theCartIsOpened() {
        inventoryPage.clickOnCart();
    }

    @And("the Hamburger Menu is Clicked")
    public void theHamburgerMenuIsClicked() {
        inventoryPage.clickOnOpenMenuButton();
    }

    @When("the All items option is chosen")
    public void theAllItemsOptionIsChosen() {
        inventoryPage.clickOnAllItems();
    }

    @Then("the inventory page is opened")
    public void theInventoryPageIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(), InventoryPage.PAGE_URL);
    }


    @When("About option is Clicked")
    public void aboutOptionIsClicked() {
        inventoryPage.clickOnAbout();
    }

    @Then("Check if About Webpage is opened")
    public void checkIfAboutWebpageIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://saucelabs.com/");
    }

    @When("Logout option is Clicked")
    public void logoutOptionIsClicked() {
        inventoryPage.clickOnLogout();
    }

    @Then("The Login Screen is open")
    public void theLoginScreenIsOpen() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
    }

    @Given("the Sauce Labs Backpack is added to the cart")
    public void theSauceLabsBackpackIsAddedToTheCart() {
        inventoryPage.clickOnAddCartBackpackButton();
    }

    @And("the cart badge exists")
    public void theCartBadgeExists() {
        Assert.assertTrue(inventoryPage.checkIfBadgeExists());
    }

    @When("Reset App State is Clicked")
    public void resetAppStateIsClicked() {
        inventoryPage.clickOnReset();
    }

    @Then("the cart badge does not exist")
    public void theCartBadgeDoesNotExist() {
        Assert.assertFalse(inventoryPage.checkIfBadgeExists());
    }
}

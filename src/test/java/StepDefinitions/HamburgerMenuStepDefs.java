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


}

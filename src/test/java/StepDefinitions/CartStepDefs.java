package StepDefinitions;

import Pages.InventoryPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

public class CartStepDefs extends AbstractStepDefs{
    @Given("the {string} is added to the cart")
    public void theItemIsAddedToTheCart(String itemString) {
        String[] items = itemString.split(",");
        for (String item : items){
            switch (item) {
                case "Sauce Labs Backpack":
                    inventoryPage.clickOnAddCartBackpackButton();
                    break;
                case "Sauce Labs Bike Light":
                    inventoryPage.clickOnAddCartBikeLightButton();
                    break;
                case "Sauce Labs Bolt T-Shirt":
                    inventoryPage.clickOnAddCartBoltShirtButton();
                    break;
                case "Sauce Labs Fleece Jacket":
                    inventoryPage.clickOnAddCartFleeceJacketButton();
                    break;
                case "Sauce Labs Onesie":
                    inventoryPage.clickOnAddCartOnsieButton();
                    break;
                case "Test.allTheThings() T-Shirt (Red)":
                    inventoryPage.clickOnAddCartRedTshirtButton();
                    break;
            }
        }
    }

    @And("the checkout button is clicked")
    public void theCheckoutButtonIsClicked() {
        inventoryPage.clickCheckoutButton();
    }

    @And("the First Name is filled with {string}")
    public void theFirstNameIsFilledWithString(String firstName) {
        inventoryPage.fillField(InventoryPage.FIRSTNAME,firstName);
    }

    @And("the Last Name is filled with {string}")
    public void theLastNameIsFilledWithString(String lastName) {
        inventoryPage.fillField(InventoryPage.LASTNAME,lastName);
    }

    @And("the Zip Code is filled with {string}")
    public void theZipCodeIsFilledWith(String postCode) {
        inventoryPage.fillField(InventoryPage.POSTAL_CODE,postCode);
    }

    @When("the Continue button is clicked")
    public void theContinueButtonIsClicked() {
        inventoryPage.clickContinueButton();
    }

    @Then("{string} should be shown")
    public void totalShouldBeShown(String total) {
        Assertions.assertEquals(total, inventoryPage.getTotal());
        inventoryPage.clickOnOpenMenuButton();
        inventoryPage.clickOnReset();
    }


}

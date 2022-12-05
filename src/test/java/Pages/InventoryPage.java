package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

/**
 * The class used to store the web elements for the inventory page along with the methods to access them.
 */
public class InventoryPage {

    /**
     * The page url for the inventory page.
     */
    public static final String PAGE_URL = "https://www.saucedemo.com/inventory.html";

    /**
     * The web element that has the id first-name.
     * Used to test the form filling for checkout.
     */
    public static final By FIRSTNAME = By.id("first-name");

    /**
     * The web element that has the id last-name.
     * Used to test the form filling for checkout.
     */
    public static final By LASTNAME = By.id("last-name");

    /**
     * The web element that has the id postal-code.
     * Used to test the form filling for checkout.
     */
    public static final By POSTAL_CODE = By.id("postal-code");

    /**
     * The web driver used to test the page.
     */
    private WebDriver driver;

    /**
     * The web element that is linked to the hamburger menu button.
     * Used to open the hamburger menu.
     */
    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    private WebElement openMenuButton;

    /**
     * The web element that is linked to the all items button in the hamburger menu.
     * Used to go to the inventory page to see all items.
     */
    @FindBy(xpath = "//*[@id='inventory_sidebar_link']")
    private WebElement inventorySidebarLinkAllItems;

    /**
     * The web element that is linked to the about button in the hamburger menu.
     * Used to go to the about web page.
     */
    @FindBy(xpath = "//*[@id='about_sidebar_link']")
    private WebElement aboutSidebarLinkItemMenu;

    /**
     * The web element that is linked to the logout button in the hamburger menu.
     * Used to logout of the page and go back to the login page.
     */
    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    private WebElement logoutSidebarLinkItemMenu;

    /**
     * The web element that is linked to the reset app state button in the hamburger menu.
     * Used to reset the app state which means clearing the card.
     */
    @FindBy(xpath = "//*[@id='reset_sidebar_link']")
    private WebElement resetSidebarLinkAppState;

    /**
     * The web element that is linked to the filter menu.
     * Used to open the filter menu to sort the page.
     */
    @FindBy(xpath = "//select")
    private WebElement productSortContainer;

    /**
     * The web element linked to the filter from A to Z button within the filter menu.
     * Used to filter the inventory items from A to Z.
     */
    @FindBy(xpath = "//option[@value=\"az\"]")
    private WebElement filterAToZ;

    /**
     * The web element linked to the filter from Z to A button within the filter menu.
     * Used to filter the inventory items from Z to A.
     */
    @FindBy(xpath = "//option[@value=\"za\"]")
    private WebElement filterZToA;

    /**
     * The web element linked to the price low to high button within the filter menu.
     *  Used to filter the inventory items from price low to high.
     */
    @FindBy(xpath = "//option[@value=\"lohi\"]")
    private WebElement priceLowHigh;

    /**
     * The web element linked to the price high to low button within the filter menu.
     *  Used to filter the inventory items from price high to low.
     */
    @FindBy(xpath = "//option[@value=\"hilo\"]")
    private WebElement priceHighLow;

    /**
     * The web element linked to the shopping cart button.
     * Used to open the shopping cart page.
     */
    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCartLink;

    /**
     * The web element linked to the add sauce labs backpack to cart button.
     *  Used to add the sauce labs backpack to the cart.
     */
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addCartSauceLabsBackpackButton;

    /**
     * The web element linked to the add sauce labs bike light to cart button.
     *  Used to add the sauce labs bike light to the cart.
     */
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement addCartSauceLabsBikeButton;

    /**
     * The web element linked to the add sauce labs bolt t-shirt to cart button.
     *  Used to add the sauce labs bolt t-shirt to the cart.
     */
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addCartSauceLabsBoltButton;

    /**
     * The web element linked to the add sauce labs fleece jacket to cart button.
     *  Used to add the sauce labs fleece jacket to the cart.
     */
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement addCartSauceLabsFleeceButton;

    /**
     * The web element linked to the add sauce labs onesie to cart button.
     *  Used to add the sauce labs onesie to the cart.
     */
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addCartSauceLabsOnesieButton;

    /**
     * The web element linked to the add test.allthethings() t-shirt (red) to cart button.
     *  Used to add the test.allthethings() t-shirt (red)to the cart.
     */
    @FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement addCartRedTshirtButton;

    /**
     * The web element linked to the checkout button.
     * Used to open the checkout page.
     */
    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkoutButton;


    /**
     * The web element linked to the total value displayed in the cart page.
     * Used to access the total value of products in the cart.
     */
    @FindBy(xpath = "//div[@class=\"summary_total_label\"]")
    private WebElement totalSummaryLabel;

    /**
     * The web element linked to the continue button.
     * Used to continue to the checkout page.
     */
    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueButton;

    /**
     * The web element linked to the error message of the information form.
     * Used to get the error message if an invalid input in the information form has occurred.
     */
    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")
    private WebElement informationErrorMessage;

    /**
     * The Constructor for the InventoryPage class.
     * @param driver the web driver that is used to access the page.
     */
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * The method used to initialize the web elements collected.
     */
    public void initializeInventoryPage(){
        PageFactory.initElements(driver, this);
    }

    /**
     * The method used to fill out text fields.
     * @param locator the By locator for the field to be filled.
     * @param value the string value being filled in the field found by the locator.
     */
    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    /**
     * The method that returns the field we wish to retrieve using the locator of said field.
     * @param locator the By locator for the field to retrieve.
     * @return the field we wish to retrieve using the locator.
     */
    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    /**
     * The method used to click on the shoppingCartLink web element.
     */
    public void clickOnCart(){
        shoppingCartLink.click();
    }

    /**
     * The method used to click on the openMenuButton web element.
     */
    public void clickOnOpenMenuButton(){
        openMenuButton.click();
    }

    /**
     * The method used to click on the inventorySidebarLinkAllItems web element.
     */
    public void clickOnAllItems(){
        inventorySidebarLinkAllItems.click();
    }

    /**
     * The method used to click on the aboutSidebarLinkItemMenu web element.
     */
    public void clickOnAbout(){
        aboutSidebarLinkItemMenu.click();
    }

    /**
     * The method used to click on the logoutSidebarLinkItemMenu web element.
     */
    public void clickOnLogout(){
        logoutSidebarLinkItemMenu.click();
    }

    /**
     * The method used to click on the resetSidebarLinkAppState web element.
     */
    public void clickOnReset(){
        resetSidebarLinkAppState.click();
    }

    /**
     * The method used to click on the productSortContainer web element.
     */
     public void clickOnProductSort(){
        productSortContainer.click();
     }

    /**
     * The method used to click on the filterAToZ web element.
     */
     public void clickOnfilterAToZ(){
        filterAToZ.click();
     }

    /**
     * The method used to click on the filterZToA web element.
     */
    public void clickOnfilterZToA(){
        filterZToA.click();
    }

    /**
     * The method used to click on the priceLowHigh web element.
     */
    public void clickOnPriceLowToHigh(){
        priceLowHigh.click();
    }

    /**
     * The method used to click on the priceHighLow web element.
     */
    public void clickOnPriceHighToLow(){
        priceHighLow.click();
    }

    /**
     * The method used to click on the addCartSauceLabsBackpackButton web element.
     */
    public void clickOnAddCartBackpackButton(){
        addCartSauceLabsBackpackButton.click();
    }

    /**
     * The method used to click on the addCartSauceLabsBikeButton web element.
     */
    public void clickOnAddCartBikeLightButton(){
        addCartSauceLabsBikeButton.click();
    }

    /**
     * The method used to click on the addCartSauceLabsBoltButton web element.
     */
    public void clickOnAddCartBoltShirtButton(){
        addCartSauceLabsBoltButton.click();
    }

    /**
     * The method used to click on the addCartSauceLabsFleeceButton web element.
     */
    public void clickOnAddCartFleeceJacketButton(){
        addCartSauceLabsFleeceButton.click();
    }

    /**
     * The method used to click on the addCartSauceLabsOnsieButton web element.
     */
    public void clickOnAddCartOnsieButton(){
        addCartSauceLabsOnesieButton.click();
    }

    /**
     * The method used to click on the addCartRedTshirtButton web element.
     */
    public void clickOnAddCartRedTshirtButton(){
        addCartRedTshirtButton.click();
    }

    /**
     * The method used to click on the checkoutButton web element.
     */
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    /**
     * The method used to click on the continueButton web element.
     */
    public void clickContinueButton(){
        continueButton.click();
    }

    /**
     * The method used to get the text from the totalSummaryLabel web element.
     */
    public String getTotal(){
        return totalSummaryLabel.getText();
    }

    /**
     * The method used to get the Information Error Message from the informationErrorMessage web element.
     */
    public String getInformationErrorMessage(){
        return informationErrorMessage.getAttribute("innerText");
    }

    /**
     * The method used to check if the shopping cart web element contains a web element called badge that shows how many items are in the cart.
     */
    public boolean checkIfBadgeExists(){
        List<WebElement> elements = driver.findElements(By.cssSelector("div.page_wrapper div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) a.shopping_cart_link > span.shopping_cart_badge"));
        if(elements.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    /**
     * The method used to check if the items on the inventory page are in ascending order.
     * @return a boolean value indicating whether or not the items are in ascending order.
     */
    public boolean checkIfItemsFilteredAToZ(){
        List<WebElement> elements = driver.findElements(By.cssSelector("div.page_wrapper div:nth-child(1) div:nth-child(2) div:nth-child(1) div.inventory_container > div.inventory_list"));
        ArrayList<String> sortedByNameAscending = new ArrayList<>();
        ArrayList<String> retrievedNames = new ArrayList<>();
        for(WebElement element : elements){
            retrievedNames.add(element.findElement(By.className("inventory_item_name")).getText());
            sortedByNameAscending.add(element.findElement(By.className("inventory_item_name")).getText());
        }
        Collections.sort(sortedByNameAscending);
        for(int i = 0; i < retrievedNames.size();i++){
            if(!retrievedNames.get(i).equals(sortedByNameAscending.get(i))){
                return false;
            }
        }

        return true;
    }

    /**
     * The method used to check if the items on the inventory page are sorted in descending order.
     * @return a boolean value indicating whether or not the items are in descending order.
     */
    public boolean checkIfItemsFilteredZToA(){
        List<WebElement> elements = driver.findElements(By.cssSelector("div.page_wrapper div:nth-child(1) div:nth-child(2) div:nth-child(1) div.inventory_container > div.inventory_list"));
        ArrayList<String> sortedByNameDescending = new ArrayList<>();
        ArrayList<String> retrievedNames = new ArrayList<>();
        for(WebElement element : elements){
            retrievedNames.add(element.findElement(By.className("inventory_item_name")).getText());
            sortedByNameDescending.add(element.findElement(By.className("inventory_item_name")).getText());
        }
        Collections.sort(sortedByNameDescending,Collections.reverseOrder());
        for(int i = 0; i < retrievedNames.size();i++){
            if(!retrievedNames.get(i).equals(sortedByNameDescending.get(i))){
                return false;
            }
        }

        return true;
    }

    /**
     * The method used to check if items on the inventory page are sorted by price in ascending order.
     * @return a boolean value indicating whether or not the items are in ascending order.
     */
    public boolean checkIfItemsFilteredLowToHigh(){
        List<WebElement> elements = driver.findElements(By.cssSelector("div.page_wrapper div:nth-child(1) div:nth-child(2) div:nth-child(1) div.inventory_container > div.inventory_list"));
        ArrayList<Float> sortedByPriceAscending = new ArrayList<>();
        ArrayList<Float> retrievedPrice = new ArrayList<>();
        for(WebElement element : elements){
            retrievedPrice.add(Float.parseFloat(element.findElement(By.className("inventory_item_price")).getText().replace("$","")));
            sortedByPriceAscending.add(Float.parseFloat(element.findElement(By.className("inventory_item_price")).getText().replace("$","")));
        }
        Collections.sort(sortedByPriceAscending);
        for(int i = 0; i < retrievedPrice.size();i++){
            if(!retrievedPrice.get(i).equals(sortedByPriceAscending.get(i))){
                return false;
            }
        }

        return true;
    }

    /**
     * The method used to check if the items on the inventory page are sorted by price in descending order.
     * @return a boolean value indicating whether or not the items are in descending order.
     */
    public boolean checkIfItemsFilteredHighToLow(){
        List<WebElement> elements = driver.findElements(By.cssSelector("div.page_wrapper div:nth-child(1) div:nth-child(2) div:nth-child(1) div.inventory_container > div.inventory_list"));
        ArrayList<Float> sortedByPriceDescending = new ArrayList<>();
        ArrayList<Float> retrievedPrice = new ArrayList<>();
        for(WebElement element : elements){
            retrievedPrice.add(Float.parseFloat(element.findElement(By.className("inventory_item_price")).getText().replace("$","")));
            sortedByPriceDescending.add(Float.parseFloat(element.findElement(By.className("inventory_item_price")).getText().replace("$","")));
        }
        Collections.sort(sortedByPriceDescending,Collections.reverseOrder());
        for(int i = 0; i < retrievedPrice.size();i++){
            if(!retrievedPrice.get(i).equals(sortedByPriceDescending.get(i))){
                return false;
            }
        }

        return true;
    }
}

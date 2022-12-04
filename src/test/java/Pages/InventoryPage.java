package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class InventoryPage {

    public static final String PAGE_URL = "https://www.saucedemo.com/inventory.html";
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    private WebElement openMenuButton;

    @FindBy(xpath = "//*[@id='inventory_sidebar_link']")
    private WebElement inventorySidebarLinkAllItems;

    @FindBy(xpath = "//*[@id='about_sidebar_link']")
    private WebElement aboutSidebarLinkItemMenu;

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    private WebElement logoutSidebarLinkItemMenu;

    @FindBy(xpath = "//*[@id='reset_sidebar_link']")
    private WebElement resetSidebarLinkAppState;

    @FindBy(xpath = "//select")
    private WebElement productSortContainer;

    @FindBy(xpath = "//option[@value=\"az\"]")
    private WebElement filterAToZ;

    @FindBy(xpath = "//option[@value=\"za\"]")
    private WebElement filterZToA;

    @FindBy(xpath = "//option[@value=\"lohi\"]")
    private WebElement priceLowHigh;

    @FindBy(xpath = "//option[@value=\"hilo\"]")
    private WebElement priceHighLow;

    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addCartSauceLabsBackpackButton;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void initializeInventoryPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnCart(){
        shoppingCartLink.click();
    }

    public void clickOnOpenMenuButton(){
        openMenuButton.click();
    }

    public void clickOnAllItems(){
        inventorySidebarLinkAllItems.click();
    }

    public void clickOnAbout(){
        aboutSidebarLinkItemMenu.click();
    }

    public void clickOnLogout(){
        logoutSidebarLinkItemMenu.click();
    }

    public void clickOnReset(){
        resetSidebarLinkAppState.click();
    }
     public void clickOnProductSort(){
        productSortContainer.click();
     }

     public void clickOnfilterAToZ(){
        filterAToZ.click();
     }

    public void clickOnfilterZToA(){
        filterZToA.click();
    }

    public void clickOnPriceLowToHigh(){
        priceLowHigh.click();
    }

    public void clickOnPriceHighToLow(){
        priceHighLow.click();
    }

    public void clickOnAddCartBackpackButton(){
        addCartSauceLabsBackpackButton.click();
    }

    public boolean checkIfBadgeExists(){
        List<WebElement> elements = driver.findElements(By.cssSelector("div.page_wrapper div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) a.shopping_cart_link > span.shopping_cart_badge"));
        if(elements.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

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

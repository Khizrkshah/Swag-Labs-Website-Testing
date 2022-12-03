package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(className= "shopping_cart_link")
    public WebElement shoppingCartLink;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
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
}

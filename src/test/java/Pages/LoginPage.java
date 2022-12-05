package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The class used to store the web elements for the Login page along with the methods to access them.
 */
public class LoginPage {

    /**
     * The web driver used to test the page.
     */
    private WebDriver driver;

    /**
     * The page url for the login page.
     */
    private static final String PAGE_URL = "https://www.saucedemo.com/";

    /**
     * The web element that has the id user-name.
     * Used to test the login credentials.
     */
    public static final By USERNAME = By.id("user-name");

    /**
     * The web element that has the id password.
     * Used to test the login credentials.
     */
    public static final By PASSWORD = By.id("password");

    /**
     * The web element that is linked to the login button.
     * Used to login to the website.
     */
    @FindBy(id = "login-button")
    private WebElement loginButton;

    /**
     * The web element that is linked to the login error message.
     * Used to check if an incorrect login has been attempted.
     */
    @FindBy(xpath = "//h3")
    private WebElement loginErrorMessage;

    /**
     * The Constructor for the LoginPage class.
     * @param driver the web driver used to test the page.
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * The method used to open the webpage using the driver and initialize of the web elements within the page that have been defined.
     */
    public void openPage() {
        driver.get(PAGE_URL);
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
     * The method used to click the loginButton web element.
     */
    public void clickLoginButton(){
        loginButton.click();
    }

    /**
     * The method used to return the text value from the loginErrorMessage web element.
     * @return the text value from the loginErrorMessage.
     */
    public String getLoginErrorMessage(){
        return loginErrorMessage.getText();
    }

}

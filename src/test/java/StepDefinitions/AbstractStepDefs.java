package StepDefinitions;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * The Abstract class that contains all the Abstract step definitions.
 */
public abstract class AbstractStepDefs {

    /**
     * the amount of time driver should wait for the elements to load.
     */
    private static final int WAIT_TIME = 50;

    /**
     * The web driver that is used to test the pages.
     */
    static WebDriver driver;

    /**
     * An object of type LoginPage.
     */
    protected static LoginPage loginPage;

    /**
     * An Object of type InventoryPage.
     */
    protected static InventoryPage inventoryPage;

    /**
     * The static block containing the Webdriver setup.
     */
    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

    }

}

package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    public WebDriver driver;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\AutomationSeleniumProjects\\PracticeJuneJulyAugust\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
package GoogleElementsAndFlows;

import LoginElementsAndFlows.LoginElements;
import org.openqa.selenium.WebDriver;

public class GoogleMethods {
    private WebDriver driver;
    private GoogleElements googleElements;

    public GoogleMethods(WebDriver driver) {
        this.driver=driver;
        this.googleElements = new GoogleElements(driver);
    }

    public boolean checkPageTitle (String title) {
        return driver.getTitle().equals(title);
    }


}

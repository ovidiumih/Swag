package LoginElementsAndFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginElements   {
    private WebDriver driver;

    public LoginElements(WebDriver driver) {
        this.driver = driver;
    }

    public class Identifiers {
        public static final String EMAIL_FIELD = "username";
        public static final String PASSWORD_FIELD = "password";
        public static final String CONNECT_BUTTON = "orangehrm-login-button";
        public static final String DASHBOARD_VISIBLE = "oxd-topbar-header-title";
        public static final String WRONG_CREDENTIALS_NOTIFICATION = "oxd-alert-content-text";
        public static final String BLANK_FIELDS = "oxd-input-group__message";

    }

    public void waitForElementToBeVisible(By locator, int seconds)
    {
        WebDriverWait GENERAL_WAIT = new WebDriverWait(driver, seconds);
        GENERAL_WAIT.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement emailField (){
        waitForElementToBeVisible(By.name(Identifiers.EMAIL_FIELD), 10);
        return driver.findElement(By.name(Identifiers.EMAIL_FIELD));
    }

    public WebElement passwordField (){

        waitForElementToBeVisible(By.name(Identifiers.EMAIL_FIELD), 10);
        return driver.findElement(By.name(Identifiers.PASSWORD_FIELD));
    }

    public WebElement connectButton (){
        waitForElementToBeVisible(By.name(Identifiers.EMAIL_FIELD), 10);
        return driver.findElement(By.className(Identifiers.CONNECT_BUTTON));
    }

    public boolean check_homePage  (){
        waitForElementToBeVisible(By.className(Identifiers.DASHBOARD_VISIBLE), 20);
        return driver.findElement(By.className(Identifiers.DASHBOARD_VISIBLE)).isDisplayed();
    }

    public String checkNotifcationForInvalidCredentials  (){
        waitForElementToBeVisible(By.className(Identifiers.WRONG_CREDENTIALS_NOTIFICATION), 15);
        return driver.findElement(By.className(Identifiers.WRONG_CREDENTIALS_NOTIFICATION)).getText();
    }

    public boolean checkEmptyField (){

        List<WebElement> list_empty_fields = driver.findElements(By.className(Identifiers.BLANK_FIELDS));
        for (WebElement elem : list_empty_fields){
            if (!elem.getText().equals("Required")){
                return false;
            }
        }
        return true;
    }


}

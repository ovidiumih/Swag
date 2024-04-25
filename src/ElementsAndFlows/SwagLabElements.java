package ElementsAndFlows;


import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabElements extends BaseTest {
    protected WebDriver driver;

    public SwagLabElements(WebDriver driver) {
        this.driver = driver;
    }

    public class Identifiers {
        public static final String USERNAME_FIELD = "user-name";
        public static final String PASSWORD_FIELD = "password";
        public static final String LOGIN_BUTTON = "login-button";
        public static final String DASHBOARD_VISIBLE = "shopping_cart_container";
        public static final String CART = ".shopping_cart_link";
        public static final String CART_LIST = ".cart_list";
        public static final String CHECKOUT_BUTTON = "checkout";
        public static final String FIRST_NAME_FIELD = "first-name";
        public static final String LAST_NAME_FIELD = "last-name";
        public static final String POSTAL_CODE_FIELD = "postal-code";
        public static final String SUBMIT_BUTTON = ".submit-button";
        public static final String SUMMARY_TOTAL = ".summary_total_label";
        public static final String FINISH = "finish";
        public static final String ORDER_DISPATCHED = "checkout_complete_container";
        public static final String BACK_HOME_BUTTON = "back-to-products";
        public static final String CHECKOUT_INFO = ".checkout_info";
        public static final String INVENTORY = ".inventory_item";
    }

    public void waitForElementToBeVisible(By locator, int seconds)
    {
        WebDriverWait GENERAL_WAIT = new WebDriverWait(driver, seconds);
        GENERAL_WAIT.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement emailField (){
        waitForElementToBeVisible(By.id(Identifiers.USERNAME_FIELD), 10);
        return driver.findElement(By.id(Identifiers.USERNAME_FIELD));
    }

    public WebElement passwordField (){
        waitForElementToBeVisible(By.id(Identifiers.PASSWORD_FIELD), 10);
        return driver.findElement(By.id(Identifiers.PASSWORD_FIELD));
    }

    public WebElement connectButton (){
        waitForElementToBeVisible(By.id(Identifiers.LOGIN_BUTTON), 10);
        return driver.findElement(By.id(Identifiers.LOGIN_BUTTON));
    }


    public boolean check_homePage  (){
        waitForElementToBeVisible(By.className(Identifiers.DASHBOARD_VISIBLE), 25);
        return driver.findElement(By.className(Identifiers.DASHBOARD_VISIBLE)).isDisplayed();
    }

    // Check if there are products on the home page
    public boolean checkProducts () {
        waitForElementToBeVisible(By.cssSelector(Identifiers.INVENTORY), 10);
        return driver.findElements(By.cssSelector(Identifiers.INVENTORY)).size()>0;
    }

    // I have created a list with all the products from the home page and I can add to cart each product. In this case I added the first product from the list
    public WebElement addProductToCart (int ProductNr){
        return driver.findElements(By.cssSelector(Identifiers.INVENTORY)).get(ProductNr).findElement(By.cssSelector("[id^='add-to-cart']"));
    }

    public boolean checkCartProdNr(String NrProduseAdaugateInCos){
        waitForElementToBeVisible(By.cssSelector(Identifiers.CART), 10);
        return driver.findElement(By.cssSelector(Identifiers.CART)).getText().equals(NrProduseAdaugateInCos);
    }

    public WebElement cartButton (){
        waitForElementToBeVisible(By.cssSelector(Identifiers.CART), 10);
        return driver.findElement(By.cssSelector(Identifiers.CART));
    }

    public Boolean checkIfCartIsOpen (){
        waitForElementToBeVisible(By.cssSelector(Identifiers.CART_LIST), 10);
        return driver.findElement(By.cssSelector(Identifiers.CART_LIST)).isDisplayed();
    }

    public WebElement checkOutButton (){
        waitForElementToBeVisible(By.id(Identifiers.CHECKOUT_BUTTON), 10);
        return driver.findElement(By.id(Identifiers.CHECKOUT_BUTTON));
    }

    public WebElement firstNameField(){
        waitForElementToBeVisible(By.id(Identifiers.FIRST_NAME_FIELD), 10);
        return driver.findElement(By.id(Identifiers.FIRST_NAME_FIELD));
    }

    public WebElement lastNameField(){
        waitForElementToBeVisible(By.id(Identifiers.LAST_NAME_FIELD), 10);
        return driver.findElement(By.id(Identifiers.LAST_NAME_FIELD));
    }

    public WebElement postalCodeField(){
        waitForElementToBeVisible(By.id(Identifiers.POSTAL_CODE_FIELD), 10);
        return driver.findElement(By.id(Identifiers.POSTAL_CODE_FIELD));
    }

    public WebElement continueButton(){
        waitForElementToBeVisible(By.cssSelector(Identifiers.SUBMIT_BUTTON), 10);
        return driver.findElement(By.cssSelector(Identifiers.SUBMIT_BUTTON));
    }

    public boolean paymentVisible (){
        waitForElementToBeVisible(By.cssSelector(Identifiers.SUMMARY_TOTAL), 10);
        return driver.findElement(By.cssSelector(Identifiers.SUMMARY_TOTAL)).isDisplayed();
    }

    public WebElement finish (){
        waitForElementToBeVisible(By.id(Identifiers.FINISH), 10);
        return driver.findElement(By.id(Identifiers.FINISH));
    }

    public boolean orderDispatched (){
        waitForElementToBeVisible(By.id(Identifiers.ORDER_DISPATCHED), 10);
        return driver.findElement(By.id(Identifiers.ORDER_DISPATCHED)).isDisplayed();
    }

    public WebElement backHomeButton(){
        waitForElementToBeVisible(By.id(Identifiers.BACK_HOME_BUTTON), 10);
        return driver.findElement(By.id(Identifiers.BACK_HOME_BUTTON));
    }

    public boolean checkInformationPage (){
        waitForElementToBeVisible(By.cssSelector(Identifiers.CHECKOUT_INFO), 10);
        return driver.findElement(By.cssSelector(Identifiers.CHECKOUT_INFO)).isDisplayed();
    }


}

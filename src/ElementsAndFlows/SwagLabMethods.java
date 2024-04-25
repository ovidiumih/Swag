package ElementsAndFlows;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SwagLabMethods {
    private WebDriver driver;
    private SwagLabElements swagLabElements;
    SoftAssert softAssert = new SoftAssert();

    public SwagLabMethods(WebDriver driver) {
        this.driver=driver;
        this.swagLabElements = new SwagLabElements(driver);
    }


    public void insertUsername(String email){
        swagLabElements.emailField().sendKeys(email);
    }

    public void insertPassword(String password){
        swagLabElements.passwordField().sendKeys(password);
    }

    public void pressLogin(){
        swagLabElements.connectButton().submit();
    }

    public boolean checkHomePage (){
        return swagLabElements.check_homePage();
    }

    public void pressCheckoutButton() {
        swagLabElements.checkOutButton ().click();
    }


    public void fillInformation (){
        swagLabElements.firstNameField().sendKeys("Ovidiu");
        swagLabElements.lastNameField().sendKeys("Mihalache");
        swagLabElements.postalCodeField().sendKeys("711245");
    }

    public void pressContinueButton (){
        swagLabElements.continueButton().click();
    }

    public void pressFinishButton (){
        swagLabElements.finish().click();
    }

    public boolean checkPaymentVisible(){
        return swagLabElements.paymentVisible();
    }

    public boolean checkOrderFilled (){
        return swagLabElements.orderDispatched();
    }

    public void pressBackHome (){
        swagLabElements.backHomeButton().click();
    }

    public boolean checkIfThereAreProducts (){
        return swagLabElements.checkProducts();
    }

    public void pressAddProductToCart(){
        swagLabElements.addProductToCart(0).click();
    }

    public boolean checkIfProductAddedToCart(String NrProduseAdaugateInCos){
        return swagLabElements.checkCartProdNr(NrProduseAdaugateInCos);
    }

    public void pressCartButton(){
        swagLabElements.cartButton().click();
    }

    public boolean checkIfCartOpen(){
        return  swagLabElements.checkIfCartIsOpen();
    }

    public boolean checkInfoPageVisible (){
        return swagLabElements.checkInformationPage ();
    }


    public void login (String url, String username, String pass){
        driver.get(url);
        insertUsername(username);
        insertPassword(pass);
        pressLogin();
        softAssert.assertTrue(checkHomePage(),"The dashboard is not visible. The login is failed");
        softAssert.assertAll();
    }


}

package Tests;

import Base.BaseTest;
import ElementsAndFlows.SwagLabMethods;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLab extends BaseTest {


    @Test(priority = 0, description = "This test will check the successfull login vith valid credentials and the acquisition of a product")
    public void checkOrderPlacement() {
        try {
         SoftAssert softAssert = new SoftAssert();

         SwagLabMethods swagLabMethods = new SwagLabMethods(driver);
         swagLabMethods.login("https://www.saucedemo.com", "standard_user", "secret_sauce");

         if (swagLabMethods.checkIfThereAreProducts ()){
             swagLabMethods.pressAddProductToCart();
             softAssert.assertTrue(swagLabMethods.checkIfProductAddedToCart("1"),"The product is not added to cart");
             swagLabMethods.pressCartButton();
             softAssert.assertTrue(swagLabMethods.checkIfCartOpen(),"The cart is not open");
             swagLabMethods.pressCheckoutButton();
             softAssert.assertTrue(swagLabMethods.checkInfoPageVisible(),"The information page is not open");
             swagLabMethods.fillInformation ();
             swagLabMethods.pressContinueButton();
             softAssert.assertTrue(swagLabMethods.checkPaymentVisible(),"The payment is not open");
             swagLabMethods.pressFinishButton();
             softAssert.assertTrue(swagLabMethods.checkOrderFilled (),"The order page is not open");
             swagLabMethods.pressBackHome();
             softAssert.assertTrue(swagLabMethods.checkHomePage(),"The dashboard is not visible. The login is failed");
             softAssert.assertAll();
         }
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }


}

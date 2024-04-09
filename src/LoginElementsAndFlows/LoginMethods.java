package LoginElementsAndFlows;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMethods{
    private WebDriver driver;
    private LoginElements loginElements;

    public LoginMethods(WebDriver driver) {
        this.driver=driver;
        this.loginElements = new LoginElements(driver);
    }


    public void insertEmail(String email){
        loginElements.emailField().sendKeys(email);
    }

    public void insertPassword(String password){
        loginElements.passwordField().sendKeys(password);
    }

    public void pressConnect(){
        loginElements.connectButton().click();
    }

    public boolean checkHomePage (){
        return loginElements.check_homePage();
    }

    public boolean checkInvalidCredentials (){
        return loginElements.checkNotifcationForInvalidCredentials().equals("Invalid credentials");
    }

    public boolean checkBlankField (){
        return loginElements.checkEmptyField ();
    }

}

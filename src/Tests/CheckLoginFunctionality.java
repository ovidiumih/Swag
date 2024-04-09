package Tests;

import Base.BaseTest;
import LoginElementsAndFlows.LoginMethods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLoginFunctionality extends BaseTest {


    @Test(priority = 0, description = "This test will check the successfull login vith valid credentials")
    public void check_login_with_valid_credentials () {
        try {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginMethods loginMethods = new LoginMethods(driver);

        loginMethods.insertEmail("Admin");

        loginMethods.insertPassword("admin123");

        loginMethods.pressConnect();

        Assert.assertTrue(loginMethods.checkHomePage(),"Login is failed");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }

    @Test(priority = 1, description = "This test will check the notification of login with invalid username and invalid password")
    public void check_login_with_invalid_username_and_invalid_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("test");

            loginMethods.insertPassword("test");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkInvalidCredentials (),"Notification is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }

    @Test(priority = 2, description = "This test will check the notification of login with invalid username and valid password")
    public void check_login_with_invalid_username_and_valid_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("test");

            loginMethods.insertPassword("admin123");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkInvalidCredentials (),"Notification is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }

    @Test(priority = 3, description = "This test will check the notification of login with valid username and invalid password")
    public void check_login_with_valid_username_and_invalid_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("Admin");

            loginMethods.insertPassword("test");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkInvalidCredentials (),"Notification is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }


    @Test(priority = 4, description = "This test will check the notification of login with empty username and valid password")
    public void check_login_with_blank_username_and_valid_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("");

            loginMethods.insertPassword("admin123");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkBlankField (),"Notification for empty fields is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }


    @Test(priority = 5, description = "This test will check the notification of login with valid username and empty password")
    public void check_login_with_valid_username_and_blank_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("Admin");

            loginMethods.insertPassword("");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkBlankField (),"Notification for empty fields is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }

    @Test(priority = 6, description = "This test will check the notification of login with empty username and invalid password")
    public void check_login_with_blank_username_and_invalid_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("");

            loginMethods.insertPassword("test");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkBlankField (),"Notification for empty fields is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }


    @Test(priority = 6, description = "This test will check the notification of login with invalid username and empty password")
    public void check_login_with_invalid_username_and_blank_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("test");

            loginMethods.insertPassword("");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkBlankField (),"Notification for empty fields is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }


    @Test(priority = 7, description = "This test will check the notification of login with empty username and password")
    public void check_login_with_blank_username_and_blank_password() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            LoginMethods loginMethods = new LoginMethods(driver);

            loginMethods.insertEmail("");

            loginMethods.insertPassword("");

            loginMethods.pressConnect();

            Assert.assertTrue(loginMethods.checkBlankField (),"Notification for empty fields is not according to requirements");
        }
        catch (Exception genEx) {
            throw  genEx;
        }
        finally {
            tearDown();
        }
    }
}

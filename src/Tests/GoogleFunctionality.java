package Tests;
import Base.BaseTest;
import Base.TestConfig;
import GoogleElementsAndFlows.GoogleMethods;
import config.ConfigFileReader;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleFunctionality extends BaseTest {

    @Test (priority = 1, description = "In the TestNG.xml there are 2 parameters that are used when running this test. ")
    @Parameters("url")
    public void checkGoogleWithTestNG(String url){
        driver.get(url);

        GoogleMethods googleMethods = new GoogleMethods(driver);

        Assert.assertTrue(googleMethods.checkPageTitle("Google"), "Page title is not as expected");
    }


    @Test (priority = 2, description = "From TestConfig class can be selected which environment can be used, either production or stagging")
    public void checkGoogleWithTestConfiguration(){
        GoogleMethods googleMethods = new GoogleMethods(driver);

        String url = TestConfig.PROD_URL;

        driver.get(url);

        Assert.assertTrue(googleMethods.checkPageTitle("Google"), "Page title is not as expected");
    }


    @Test (priority = 3, description = "The ConfigFileReader class read from config.properties and allows the selection of the environment to be used, either production or staging.")
    public void checkGoogleWithConfigurationPropertiesFile(){
        GoogleMethods googleMethods = new GoogleMethods(driver);

        ConfigFileReader configReader = new ConfigFileReader("src/config/config.properties");

        String url = configReader.getProperty("prod_url");

        driver.get(url);

        Assert.assertTrue(googleMethods.checkPageTitle("Google"), "Page title is not as expected");
    }
}

package tests;

import base.BaseTest;
import config.ConfigLoader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private LandingPage landingPage;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();// Ensure the BaseTest setUp() is executed
        landingPage= new LandingPage(driver);
        loginPage=new LoginPage(driver);
    }

    @Test
    public void testValidLogin(){
        landingPage.clickOnMyAccount();
        loginPage.enterUsername(ConfigLoader.getProperty("username"));
        loginPage.clickSubmit();
        loginPage.enterPassword(ConfigLoader.getProperty("password"));
        loginPage.clickSubmit();

       // String expectedTitle="";

      //  assert driver.getTitle().contains(expectedTitle) : "Login failed, title does not match!";

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package base;

import config.ConfigLoader;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/*
To set up and tear down WebDriver
 */
public class BaseTest {
    protected static WebDriver driver;

    /*
    Executes once before any test methods in the class.
    Initializes the WebDriver instance.
     */
    @BeforeClass
    public void setUp(){
        System.out.println("BaseTest.setUp() - Initializing WebDriver");
        driver = DriverManager.getDriver();
        String baseUrl= ConfigLoader.getProperty("url");
        if(baseUrl ==null || baseUrl.isEmpty()){
            throw new IllegalArgumentException("Base URL is not configured");
        }
        driver.get(baseUrl);
        System.out.println("Navigated to base URL: "+ baseUrl);

    }

    /*
    Executes once after all test methods in the class.
    Cleans up and quits the WebDriver instance.

     */
    @AfterClass
    public void tearDown(){
        DriverManager.quitDriver();
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver webDriver;

    //Locators declared as private final. This means they can't be accidentally modified.
    private final By loginPage=By.id("my_account");

    //Constructors
    public LandingPage(WebDriver driver){
        this.webDriver=driver;
    }

    public void clickOnMyAccount(){
        webDriver.findElement(loginPage).click();
    }
}

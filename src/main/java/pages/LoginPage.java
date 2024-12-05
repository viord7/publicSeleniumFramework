package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    //Locators declared as private final. This means they can't be accidentally modified.
    private final By usernameField=By.id("user_login_email");
    private final By passwordField=By.id("user_login_password");
    private final By submitButton=By.id("user_login_continue");

    //Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    //Actions
    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit(){driver.findElement(submitButton).click();
    }
}

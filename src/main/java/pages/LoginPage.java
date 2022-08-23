package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameTextFieldBy = By.id("user-name");
    By passwordTextFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");

    public LoginPage basePage(){
        driver.get(PropertyManager.getInstance().getUrl());
        return this;
    }

    public LoginPage login(String username, String password){
        writeText(usernameTextFieldBy,username);
        writeText(passwordTextFieldBy,password);
        click(loginButtonBy);
        return this;
    }

    public LoginPage loginWithOutUsername(String password){
        writeText(passwordTextFieldBy,password);
        click(loginButtonBy);
        return this;
    }

    public LoginPage loginWithOutPassword(String username){
        writeText(usernameTextFieldBy,username);
        click(loginButtonBy);
        return this;
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedinPage extends BasePage{
    public LoggedinPage(WebDriver driver) {
        super(driver);
    }
    By mainmenuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");


    public LoggedinPage logout(){
        click(mainmenuButtonBy);
        click(logoutButtonBy);
        return this;
    }
}

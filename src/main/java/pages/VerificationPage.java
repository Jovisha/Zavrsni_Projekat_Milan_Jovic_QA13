package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage{
    public VerificationPage(WebDriver driver) {
        super(driver);
    }
    By errorNotificationNoUsernameBy = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    By errorNotificationNoPasswordBy = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    By errorNotificationBy = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    By pageNameBy = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By mainmenyPasswordTextBy = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4");
    By addToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By completedOrderGreetingBy = By.className("complete-header");
    By checkRightItemByNameBy = By.className("inventory_item_name");

    public VerificationPage verifyFailedLoginWithOutUsername(String expectedText){
        String alertusername = readText(errorNotificationNoUsernameBy);
        assertStringEquals(alertusername,expectedText);
        return this;
    }

    public VerificationPage verifyFailedLoginWithOutPassword(String expectedText){
        String alertpassword = readText(errorNotificationNoPasswordBy);
        assertStringEquals(alertpassword, expectedText);
        return this;
    }

    public VerificationPage verifyFailedLogin(String expectedText){
        String alertbadcredentials = readText(errorNotificationBy);
        assertStringEquals(alertbadcredentials,expectedText);
        return this;
    }

    public VerificationPage verifyLogin(String expectedText){
        String login = readText(pageNameBy);
        assertStringEquals(login,expectedText);
        return this;
    }

    public VerificationPage verifyLogout(String expectedText){
        String logout = readText(mainmenyPasswordTextBy);
        assertStringEquals(logout,expectedText);
        return this;
    }

    public VerificationPage verifyRemovedItem(String expectedText){
        String removeditem = readText(addToCartButtonBy);
        assertStringEquals(removeditem,expectedText);
        return this;
    }

    public VerificationPage verifyPurchasedItem(String expectedText){
        String purchasedItem = readText(completedOrderGreetingBy);
        assertStringEquals(purchasedItem,expectedText);
        return this;
    }

    public VerificationPage verifyItemByName(String expectedText){
        String checkitem = readText(checkRightItemByNameBy);
        assertStringEquals(checkitem,expectedText);
        return this;
    }
}

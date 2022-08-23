package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckItemByNamePage extends BasePage{
    public CheckItemByNamePage(WebDriver driver) {
        super(driver);
    }
    By addToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCartLinkBy = By.className("shopping_cart_link");

    public CheckItemByNamePage checkItemName(){
        click(addToCartButtonBy);
        click(shoppingCartLinkBy);
        return this;
    }
}

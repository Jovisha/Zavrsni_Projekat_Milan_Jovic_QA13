package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyItemPage extends BasePage{
    public BuyItemPage(WebDriver driver) {
        super(driver);
    }
    By addToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCartLinkBy = By.className("shopping_cart_link");
    By checkoutButtonBy = By.id("checkout");
    By firstNameInputFieldBy = By.id("first-name");
    By lastNameInputFieldBy = By.id("last-name");
    By postalCodeInputFieldBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishButtonBy = By.id("finish");

    public BuyItemPage buyItem(String[] persData){
        click(addToCartButtonBy);
        click(shoppingCartLinkBy);
        click(checkoutButtonBy);
        writeText(firstNameInputFieldBy,persData[0]);
        writeText(lastNameInputFieldBy,persData[1]);
        writeText(postalCodeInputFieldBy,persData[2]);
        click(continueButtonBy);
        click(finishButtonBy);
        return this;
    }
}

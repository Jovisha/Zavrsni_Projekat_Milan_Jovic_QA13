package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveItemPage extends BasePage{
    public RemoveItemPage(WebDriver driver) {
        super(driver);
    }
    By addToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By removeItemButtonBy = By.id("remove-sauce-labs-backpack");

    public RemoveItemPage removeItem(){
        click(addToCartButtonBy);
        click(removeItemButtonBy);
        return this;
    }
}

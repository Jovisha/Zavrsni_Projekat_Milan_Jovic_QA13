package tests_with_login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoggedinPage;
import pages.RemoveItemPage;
import pages.VerificationPage;

public class RemoveItemTest extends BaseTestWithLogin{

    @Test
    public void removeItemTest(){
        RemoveItemPage removeItem = new RemoveItemPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        removeItem.removeItem();

        try {
            verificationPage.verifyRemovedItem("ADD TO CART");
            System.out.print("Selected item is removed from cart");
        }catch (Exception e){
            Assert.fail("Selected item is NOT removed from cart");
        }
    }
}

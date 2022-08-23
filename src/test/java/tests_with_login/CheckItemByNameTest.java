package tests_with_login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckItemByNamePage;
import pages.VerificationPage;

public class CheckItemByNameTest extends BaseTestWithLogin{

    @Test
    public void checkItemName(){
        CheckItemByNamePage checkItemByNamePage = new CheckItemByNamePage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        checkItemByNamePage.checkItemName();

        try {
            verificationPage.verifyItemByName("Sauce Labs Backpack");
            System.out.print("Sauce Labs Backpack is added");
        }catch (Exception e){
            Assert.fail("Purchase in NOT completed");
        }
    }
}

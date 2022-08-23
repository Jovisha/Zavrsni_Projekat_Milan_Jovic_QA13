package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getUsername(),
                        PropertyManager.getInstance().getPassword());

        try {
            verificationPage.verifyLogin("PRODUCTS");
            System.out.print("User is logged IN");
        }catch (Exception e){
            Assert.fail("User is NOT logged in");
        }
    }
}

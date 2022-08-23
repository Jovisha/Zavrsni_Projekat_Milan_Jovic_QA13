package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginTestWithEmptyPasswordField extends BaseTest{

    @Test
    public void loginWithEmptyPasswordField(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginPage.loginWithOutPassword(PropertyManager.getInstance().getUsername());

        try {
            verificationPage.verifyFailedLoginWithOutPassword("Epic sadface: Password is required");
            System.out.print("User is not logged in without Password");
        }catch (Exception e){
            Assert.fail("User is logged in");
        }
    }
}

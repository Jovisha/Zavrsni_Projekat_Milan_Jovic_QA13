package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginTestWithEmptyUsernameField extends BaseTest {

    @Test
    public void loginWithEmptyUsernameField(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginPage.loginWithOutUsername(PropertyManager.getInstance().getPassword());

        try {
            verificationPage.verifyFailedLoginWithOutUsername("Epic sadface: Username is required");
            System.out.print("User is not logged in without Username");
        }catch (Exception e){
            Assert.fail("User is logged in");
        }
    }
}

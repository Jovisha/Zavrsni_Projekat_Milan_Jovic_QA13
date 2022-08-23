package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class FailedLoginTest extends BaseTest{

    @Test
    public void failedLogin(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getBad_username(),
                        PropertyManager.getInstance().getBad_password());

        try {
            verificationPage.verifyFailedLogin("Epic sadface: Username and password do not match any user in this service");
            System.out.print("User is not logged in");
        }catch (Exception e){
            Assert.fail("User is logged in");
        }
    }

}

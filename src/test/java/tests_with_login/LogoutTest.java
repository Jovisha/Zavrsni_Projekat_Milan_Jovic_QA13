package tests_with_login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoggedinPage;
import pages.VerificationPage;

public class LogoutTest extends BaseTestWithLogin{

    @Test
    public void logout(){
        LoggedinPage loggedinPage = new LoggedinPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loggedinPage.logout();

        try {
            verificationPage.verifyLogout("Password for all users:");
            System.out.print("User is logged OUT");
        }catch (Exception e){
            Assert.fail("User is NOT logged OUT");
        }
    }
}

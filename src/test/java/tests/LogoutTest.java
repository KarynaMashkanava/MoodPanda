package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LogoutTest extends BaseTest{

    @Test
    public void logoutSuccessTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        MainPage mainPage = new MainPage();
        loginPage = mainPage.logout();
        Assert.assertTrue(loginPage.isLoginButtonPresent(), "Login button isn't present");
    }
}

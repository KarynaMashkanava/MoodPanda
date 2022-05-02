package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest{

    private static final String INCORRECT_PASSWORD = "11235811";
    private static final String ERROR_MESSAGE = "Your email or password is wrong";

    @Test
    public void loginSuccessTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(), 2, "Quantity of titles isn't expected");
    }

    @Test
    public void loginFailureTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, INCORRECT_PASSWORD);
        Assert.assertEquals(loginPage.getLoginErrorMessage(), ERROR_MESSAGE, "Error message is incorrect");
    }
}

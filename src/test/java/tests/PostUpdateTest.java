package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MainPage;
import pages.PostPage;

public class PostUpdateTest extends BaseTest {
    private static final String REASON_ERROR = "A reason is required";
    private static final String GENERAL_ERROR = "One or more validation errors occurred.";

    @Test
    public void validateErrorTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        MainPage mainPage = new MainPage();
        PostPage postPage = mainPage.clickPostUpdate();
        postPage.clickUpdateButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(postPage.verifyErrorReason(), REASON_ERROR);
        softAssert.assertEquals(postPage.verifyGeneralError(), GENERAL_ERROR);
        softAssert.assertAll();
    }
}

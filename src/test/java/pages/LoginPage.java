package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import staticdata.WebUrls;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
        * LoginPage class it's wrapper for standard input element
        *
        * @author Alex K
        *
        */

public class LoginPage {
    /**
     * Email
     */
    private SelenideElement emailInput = $(By.xpath("//input[@type='text']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@type='password']"));
    private SelenideElement loginButton = $(By.xpath("//button"));
    private SelenideElement loginErrorMessage = $(By.xpath("//div[@class='notification is-danger']"));

    public void openLoginPage() {
        open(Configuration.baseUrl.concat(WebUrls.LOGIN_URL));
    }

    public void login(String email, String password) {
        loginButton.shouldBe(enabled);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String getLoginErrorMessage() {
        return loginErrorMessage.getText();
    }

    public boolean isLoginButtonPresent() {
        return loginButton.isDisplayed();
    }
}

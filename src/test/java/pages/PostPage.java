package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PostPage {

    private SelenideElement updateButton = $(By.xpath("//*[contains(text(), 'Update to')]"));
    private ElementsCollection errorMessages = $$(By.xpath("//*[contains(@class, 'notification is-danger') and not(contains(@class, 'is-hidden-tablet'))]"));

    public void clickUpdateButton() {
        updateButton.click();
    }

    public String verifyErrorReason() {
        return errorMessages.get(0).getText();
    }

    public String verifyGeneralError() {
        return errorMessages.get(1).getText();
    }
}

package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private ElementsCollection globalFeedTitle = $$(By.xpath("//p[text()='Global feed']"));
    private SelenideElement logoutButton = $(By.xpath("//*[contains(text(), 'Logout')]"));
    private SelenideElement postUpdateButton = $(By.xpath("//*[contains(text(), 'Post update')]"));

    public int getTitleQuantity() {
        globalFeedTitle.get(1).shouldBe(visible);
        return globalFeedTitle.size();
    }

    public LoginPage logout() {
        logoutButton.click();
        return new LoginPage();
    }

    public PostPage clickPostUpdate() {
        postUpdateButton.click();
        return new PostPage();
    }
}

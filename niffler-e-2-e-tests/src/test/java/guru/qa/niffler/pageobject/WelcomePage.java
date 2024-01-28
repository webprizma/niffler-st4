package guru.qa.niffler.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WelcomePage {

    private final SelenideElement loginButton = $("a[href*='redirect']");
    private final SelenideElement registerButton = $("a[href*='register']");

    public void clickLogin() {
        loginButton.click();
    }

    public void clickRegister() {
        registerButton.click();
    }

}

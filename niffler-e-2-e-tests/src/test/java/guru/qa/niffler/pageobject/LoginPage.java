package guru.qa.niffler.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginInput = $("input[name='username']");
    private final SelenideElement passwordInput = $("input[name='password']");
    private final SelenideElement signInButton = $("button[type='submit']");

    public LoginPage setLogin(String login) {
        loginInput.setValue(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public void clickSignIn() {
        signInButton.click();
    }

}

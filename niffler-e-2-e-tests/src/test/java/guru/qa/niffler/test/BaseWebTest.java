package guru.qa.niffler.test;

import guru.qa.niffler.jupiter.BrowserExtension;
import guru.qa.niffler.pageobject.LoginPage;
import guru.qa.niffler.pageobject.MainPage;
import guru.qa.niffler.pageobject.WelcomePage;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BrowserExtension.class})
public abstract class BaseWebTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    WelcomePage welcomePage = new WelcomePage();
}

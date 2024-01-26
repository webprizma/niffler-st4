package guru.qa.niffler.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import guru.qa.niffler.jupiter.GenerateCategory;
import guru.qa.niffler.jupiter.GenerateSpend;
import guru.qa.niffler.model.CurrencyValues;
import guru.qa.niffler.model.SpendJson;
import org.junit.jupiter.api.Test;

public class SpendingTest extends BaseWebTest {

    static {
        Configuration.browserSize = "1980x1024";
    }

    @GenerateCategory(
            username = "duck",
            category = "Обучение"
    )
    @GenerateSpend(
            username = "duck",
            description = "QA.GURU Advanced 4",
            amount = 72500.00,
            currency = CurrencyValues.RUB
    )
    @Test
    void spendingShouldBeDeletedByButtonDeleteSpending(SpendJson spend) {
        Selenide.open("http://127.0.0.1:3000/main");
        welcomePage
                .clickLogin();
        loginPage
                .setLogin("duck")
                .setPassword("12345")
                .clickSignIn();
        mainPage
                .selectSpending(spend.description())
                .deleteSpending()
                .checkSpendingSize(0);
    }
}

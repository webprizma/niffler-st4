package guru.qa.niffler.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement spendingsTable = $(".spendings-table tbody");
    private final SelenideElement deleteSpendingButton = $(byText("Delete selected"));

    public MainPage selectSpending(String spendDescription) {
        spendingsTable
                .$$("tr")
                .find(text(spendDescription))
                .$("td")
                .scrollTo()
                .click();
        return this;
    }

    public MainPage deleteSpending() {
        deleteSpendingButton.click();
        return this;
    }

    public MainPage checkSpendingSize(int count) {
        spendingsTable
                .$$("tr")
                .shouldHave(size(count));
        return this;
    }

}
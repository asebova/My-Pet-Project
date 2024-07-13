package example;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ExampleTest {
    @Test
    @Step
    void name() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open("https://docs.github.com/en/actions");
        $("#title-h1").shouldHave(text("Проверка"));
    }
}

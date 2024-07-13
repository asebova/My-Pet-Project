package example;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ExampleTest {
    @Test
    void name() {
        open("https://docs.github.com/en/actions");
        $("div.nastya").click();
    }
}

package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class YandexMarketCatalog {
    public void selectCategory(String category) {
        $(byText("Все категории")).click();
        sleep(500);
        $(byText(category)).click();
    }
}

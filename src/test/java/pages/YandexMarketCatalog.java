package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class YandexMarketCatalog {
    public void selectCategory(String category){
        if ($(byText("Да, спасибо")).exists()) {
            executeJavaScript("$($('span.button2__text')[3]).click();");
        }

        $(byText("Все категории")).click();
        sleep(500);

        $(byText(category)).click();
    }
}

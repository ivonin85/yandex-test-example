package steps;

import cucumber.api.java.ru.Допустим;
import pages.Yandex;

import static com.codeborne.selenide.Selenide.open;

public class YandexSteps {
    Yandex yandex = new Yandex();
    @Допустим("^Яндекс - Открываем сайт$")
    public void яндекс_Открываем_сайт() {
        open("https://yandex.ru/");
    }

    @Допустим("^Яндекс - Переходим в Яедекс \"([^\"]*)\"$")
    public void яндекс_Переходим_в_Яедекс(String service) {
        yandex.selectService(service).click();
    }

    public void яндекс_Маркет_Выбираем_категорию() {




    }
}

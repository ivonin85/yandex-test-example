package steps;

import cucumber.api.java.ru.Допустим;
import pages.YandexMarketCatalog;

public class YandexMarketCatalogSteps {
    YandexMarketCatalog yandexMarketCatalog = new YandexMarketCatalog();
    @Допустим("^Яндекс Маркет каталог - Выбираем категорию \"([^\"]*)\"$")
    public void яндекс_Маркет_каталог_Выбираем_категорию(String category) {
        yandexMarketCatalog.selectCategory(category);
    }

}

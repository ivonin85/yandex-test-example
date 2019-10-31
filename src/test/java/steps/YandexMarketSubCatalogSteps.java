package steps;

import cucumber.api.java.ru.Допустим;
import pages.YandexMarketSubCatalog;

public class YandexMarketSubCatalogSteps {
    YandexMarketSubCatalog yandexMarketSubCatalog = new YandexMarketSubCatalog();

    @Допустим("^Яндекс Маркет подкаталог - Выбираем подкатегорию \"([^\"]*)\"$")
    public void яндекс_Маркет_подкаталог_Выбираем_подкатегорию(String subcategory) {
        yandexMarketSubCatalog.selectSubcategory(subcategory).click();
    }

    @Допустим("^Яндекс Маркет подкаталог - Добавляем фильтр по производителю \"([^\"]*)\"$")
    public void яндекс_Маркет_подкаталог_Добавляем_фильтр_по_производителю(String brand) {
        yandexMarketSubCatalog.selectBrand(brand).click();
    }

    @Допустим("^Яндекс Маркет подкаталог - Задаем параметр поиска по цене от \"([^\"]*)\" до \"([^\"]*)\"$")
    public void яндекс_Маркет_подкаталог_Задаем_параметр_поиска_по_цене_от_до(String firstPrice, String secondPrice) {
        yandexMarketSubCatalog.selectPrice(firstPrice, secondPrice);
    }

    @Допустим("^Яндекс Маркет подкаталог - Запоминаем название товара под номер (\\d+) в результате поиска$")
    public void яндекс_Маркет_подкаталог_Запоминаем_название_товара_под_номер_в_результате_поиска(int number) {
        yandexMarketSubCatalog.rememberSomething(number);
    }

    @Допустим("^Яндекс Маркет подкаталог - Осуществляем поиск по запомненному названию$")
    public void яндекс_Маркет_подкаталог_Осуществляем_поиск_по_запомненному_названию() {
        yandexMarketSubCatalog.searching();
    }

    @Допустим("^Яндекс Маркет подкаталог - Проверяем что наименование товара соответствует запомненному$")
    public void яндекс_Маркет_подкаталог_Проверяем_что_наименование_товара_соответствует_запомненному() {
        yandexMarketSubCatalog.compareData();
    }
}

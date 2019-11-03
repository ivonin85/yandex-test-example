$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/yandex-market.feature");
formatter.feature({
  "name": "тестиируем поиск яндекс маркет",
  "description": "",
  "keyword": "Функция",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.scenarioOutline({
  "name": "тестиируем поиск яндекс маркет",
  "description": "",
  "keyword": "Структура сценария"
});
formatter.step({
  "name": "Яндекс - Открываем сайт",
  "keyword": "Допустим "
});
formatter.step({
  "name": "Яндекс - Переходим в Яедекс \"Маркет\"",
  "keyword": "И "
});
formatter.step({
  "name": "Яндекс Маркет каталог - Выбираем категорию \"\u003cкатегория товара\u003e\"",
  "keyword": "И "
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Выбираем подкатегорию \"\u003cподкатегория товара\u003e\"",
  "keyword": "И "
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Добавляем фильтр по производителю \"\u003cпроизводитель\u003e\"",
  "keyword": "И "
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Задаем параметр поиска по цене от \"\u003cцена от\u003e\" до \"\u003cцена до\u003e\"",
  "keyword": "И "
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Запоминаем название товара под номер 2 в результате поиска",
  "keyword": "И "
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Осуществляем поиск по запомненному названию",
  "keyword": "И "
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Проверяем что наименование товара соответствует запомненному",
  "keyword": "И "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Примеры",
  "rows": [
    {
      "cells": [
        "подкатегория товара",
        "производитель",
        "цена от",
        "цена до",
        "категория товара"
      ]
    },
    {
      "cells": [
        "Планшеты",
        "Apple",
        "20000",
        "35000",
        "Компьютерная техника"
      ]
    },
    {
      "cells": [
        "Ноутбуки",
        "HP",
        "45000",
        "90000",
        "Компьютерная техника"
      ]
    },
    {
      "cells": [
        "Настольные",
        "MSI",
        "80000",
        "100000",
        "Компьютерная техника"
      ]
    }
  ]
});
formatter.scenario({
  "name": "тестиируем поиск яндекс маркет",
  "description": "",
  "keyword": "Структура сценария",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "Яндекс - Открываем сайт",
  "keyword": "Допустим "
});
formatter.match({
  "location": "YandexSteps.яндекс_Открываем_сайт()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс - Переходим в Яедекс \"Маркет\"",
  "keyword": "И "
});
formatter.match({
  "location": "YandexSteps.яндекс_Переходим_в_Яедекс(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет каталог - Выбираем категорию \"Компьютерная техника\"",
  "keyword": "И "
});
formatter.match({
  "location": "YandexMarketCatalogSteps.яндекс_Маркет_каталог_Выбираем_категорию(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Выбираем подкатегорию \"Планшеты\"",
  "keyword": "И "
});
formatter.match({
  "location": "YandexMarketSubCatalogSteps.яндекс_Маркет_подкаталог_Выбираем_подкатегорию(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Добавляем фильтр по производителю \"Apple\"",
  "keyword": "И "
});
formatter.match({
  "location": "YandexMarketSubCatalogSteps.яндекс_Маркет_подкаталог_Добавляем_фильтр_по_производителю(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Задаем параметр поиска по цене от \"20000\" до \"35000\"",
  "keyword": "И "
});
formatter.match({
  "location": "YandexMarketSubCatalogSteps.яндекс_Маркет_подкаталог_Задаем_параметр_поиска_по_цене_от_до(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Запоминаем название товара под номер 2 в результате поиска",
  "keyword": "И "
});
formatter.match({
  "location": "YandexMarketSubCatalogSteps.яндекс_Маркет_подкаталог_Запоминаем_название_товара_под_номер_в_результате_поиска(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Осуществляем поиск по запомненному названию",
  "keyword": "И "
});
formatter.match({
  "location": "YandexMarketSubCatalogSteps.яндекс_Маркет_подкаталог_Осуществляем_поиск_по_запомненному_названию()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет подкаталог - Проверяем что наименование товара соответствует запомненному",
  "keyword": "И "
});
formatter.match({
  "location": "YandexMarketSubCatalogSteps.яндекс_Маркет_подкаталог_Проверяем_что_наименование_товара_соответствует_запомненному()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ншет Apple iPad (201[9]) 32Gb Wi-Fi\u003e but was:\u003c...ншет Apple iPad (201[8]) 32Gb Wi-Fi\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat pages.YandexMarketSubCatalog.compareData(YandexMarketSubCatalog.java:52)\r\n\tat steps.YandexMarketSubCatalogSteps.яндекс_Маркет_подкаталог_Проверяем_что_наименование_товара_соответствует_запомненному(YandexMarketSubCatalogSteps.java:36)\r\n\tat ✽.Яндекс Маркет подкаталог - Проверяем что наименование товара соответствует запомненному(src/test/resources/yandex-market.feature:15)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "тестиируем поиск яндекс маркет",
  "description": "",
  "keyword": "Структура сценария",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "Яндекс - Открываем сайт",
  "keyword": "Допустим "
});
formatter.match({
  "location": "YandexSteps.яндекс_Открываем_сайт()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс - Переходим в Яедекс \"Маркет\"",
  "keyword": "И "
});
formatter.match({
  "location": "YandexSteps.яндекс_Переходим_в_Яедекс(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Яндекс Маркет каталог - Выбираем категорию \"Компьютерная техника\"",
  "keyword": "И "
});

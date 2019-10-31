package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.Assert.assertEquals;

public class YandexMarketSubCatalog {
    String query;
    String queryResult;

    public SelenideElement selectSubcategory(String subcategory){
        return $(byText(subcategory)).should(exist);
    }

    public SelenideElement selectBrand(String brand){
        return $(byText(brand)).should(exist);
    }
    public void selectPrice(String firstPrice, String secondPrice){

        do {
            $("#glpricefrom").should(exist).click();
            $("#glpricefrom").clear();
            $("#glpricefrom").setValue(firstPrice);
        }
        while (Integer.parseInt($("#glpricefrom").getValue())<Integer.parseInt(firstPrice));

        do {
            $("#glpriceto").should(exist).click();
            $("#glpriceto").clear();
            $("#glpriceto").should(exist).setValue(secondPrice);
        }
        while (Integer.parseInt($("#glpriceto").getValue())<Integer.parseInt(secondPrice));




    }

    public void rememberSomething(int number){
        Selenide.refresh();
        query = $$(".n-snippet-card2__title a").get(number-1).text();
    }
    public void searching(){
        $("#header-search").setValue(query).pressEnter();
    }

    public void compareData(){
        queryResult = $$(".n-snippet-card2__title a").get(0).text();
        assertEquals(queryResult, query);
    }
}

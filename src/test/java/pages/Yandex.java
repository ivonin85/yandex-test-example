package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.After;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Yandex {
    // возможно придется сделать public
    @After
    private void after(){
        Selenide.close();
    }

    public SelenideElement selectService(String service){
        return $(byText(service)).should(exist);
    }

}

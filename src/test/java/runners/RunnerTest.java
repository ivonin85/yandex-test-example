package runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

import static com.codeborne.selenide.WebDriverRunner.*;
import static java.lang.Thread.sleep;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/cucumber/yandex-market.feature"},
        tags = {"@prod"},
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm"},
        glue = {"steps"})

public class RunnerTest {

    @AfterClass
    public static void ieRelax() throws InterruptedException {
        if (isIE()) {
            closeWebDriver();
            sleep(500);
        }
    }

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");

        if (isIE()) {
            clearBrowserCache();
        }

        Configuration.timeout = 20000;
        Configuration.startMaximized=true;
        Configuration.browser = WebDriverRunner.INTERNET_EXPLORER;


        /*Configuration.baseUrl = "http://localhost:4444/";
        Configuration.remote = "http://10.1.0.30:4444/wd/hub";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        if ("true".equals(System.getProperty("video.enabled"))) {
            Configuration.browserCapabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities.setCapability("videoFrameRate", 24);
        }*/
    }
}

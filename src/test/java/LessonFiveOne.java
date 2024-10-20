import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LessonFiveOne {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

    }
    @Test
    void searchGit(){
        open("");
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        //выберите Solutions
        $(".HeaderMenu-dropdown-link").$(byText("Enterprises")).click();
        //$$(".HeaderMenu-dropdown-link").findBy(Condition.text("Enterprises")).click();
        //$$("ul li a").findBy(Condition.text("Enterprise")).click();
        $("h1#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
                "developer platform."));
        //выберите  Enterprize (с помощью команды hover для Solutions).
       //Убедитесь, что загрузилась нужная страница (например, что заголовок: "The AI-powered developer platform.").

    }



}

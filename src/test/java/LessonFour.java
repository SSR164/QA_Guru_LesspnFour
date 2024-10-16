import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;


public class LessonFour {



    @Test
            void tests(){
        open("https://github.com/selenide/selenide");
        //открыть https://github.com/selenide/selenide
        $("#wiki-tab").click();
        // открыть Wiki
        $(".Box-row.wiki-more-pages-link").$("button").click();
        $(".wiki-rightbar").shouldHave(Condition.text("SoftAssertions"));
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $$("ul.m-0.p-0.list-style-none li").get(20).$("a").click();
        //Откройте страницу SoftAssertions
        $(".markdown-body").shouldHave(Condition.text("@ExtendWith({SoftAssertsExtension.class})"));
        //Проверьте что внутри есть пример кода для JUnit5
        //(".markdown-heading").$("heading-element").shouldHave(Condition.text("How to soft assert using Selenide")); Не понимаю почему это не работает ((
//$(".markdown-body").shouldHave(Condition.text("@ExtendWith({SoftAssertsExtension.class})")); а это работает, объясните пожалуйста.

    }

}

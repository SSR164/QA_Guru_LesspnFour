package lessonsix.page.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;



public class RegistrationPageComponent {
    private SelenideElement tableResponsive = $(".table-responsive");

    public void checkResults (String key, String value) {
        tableResponsive.$(byText(key)).parent().shouldHave(text(value));

    }

    public void checkTableNotVisible() {
        tableResponsive.shouldNotBe(visible);

    }
}

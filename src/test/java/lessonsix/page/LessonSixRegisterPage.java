package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lessonsix.page.components.CalendarComponents;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class LessonSixRegisterPage {
    CalendarComponents calendarComponents = new CalendarComponents();
    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            subjectsInput=$("#subjectsInput"),
            hobbiesWrapperInput=$("#hobbiesWrapper"),
            currentAddressInput=$("#currentAddress"),
            uploadPictureInput=$("#uploadPicture"),
            stateInput=$("#state"),
            stateCityWrapperInput=$("#stateCity-wrapper"),
            cityInput=$("#city"),
            submitInput=$("#submit"),
            tableResponsive=$(".table-responsive");


    public LessonSixRegisterPage openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;

    }
    public LessonSixRegisterPage firstNameInput(String string){
        firstNameInput.setValue(string);
        return this;
    }
    public LessonSixRegisterPage  lastNameInput(String string){
        lastNameInput.setValue(string);
        return this;
    }
    public LessonSixRegisterPage  userEmailInput(String string){
        userEmailInput.setValue(string);
        return this;
    }
    public LessonSixRegisterPage  genderWrapper (String string){
        genderWrapper.$(byText(string)).click();
        return this;
    }
    public LessonSixRegisterPage  userNumberInput (String string){
        userNumberInput.setValue(string);
        return this;
    }

    public  LessonSixRegisterPage calendarInput(String day, String month, String year){
        calendarInput.click();
        calendarComponents.components(day,month,year);
        return this;

    }
    public LessonSixRegisterPage  subjectsInput(String string){
        subjectsInput.setValue(string).pressEnter();
        return this;
    }
    public LessonSixRegisterPage  hobbiesWrapperInput (String string){
        hobbiesWrapperInput.$(byText(string)).click();
        return this;
    }

    public LessonSixRegisterPage  currentAddressInput (String string){
        currentAddressInput.setValue(string);
        return this;
    }

    public LessonSixRegisterPage  uploadPictureInput (String string){
        uploadPictureInput.uploadFromClasspath(string);
        return this;
    }

    public LessonSixRegisterPage  stateAndCityInput (String state,String city ){
        stateInput.click();
        stateCityWrapperInput.$(byText(state)).click();
        cityInput.click();
        stateCityWrapperInput.$(byText(city)).click();
        return this;
    }

    public LessonSixRegisterPage  submitInput (){
     submitInput.click();
        return this;
    }

    public LessonSixRegisterPage   tableResponsive(String key, String value){
        tableResponsive.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
    public LessonSixRegisterPage   tableNotVisible(){
        tableResponsive.shouldNotBe(visible);
        return this;
    }
}

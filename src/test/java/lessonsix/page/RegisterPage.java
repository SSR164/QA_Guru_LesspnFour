package lessonsix.page;

import com.codeborne.selenide.SelenideElement;
import lessonsix.page.components.CalendarComponents;
import lessonsix.page.components.RegistrationPageComponent;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegisterPage {
    CalendarComponents calendarComponents = new CalendarComponents();
    RegistrationPageComponent registrationPageComponent =new RegistrationPageComponent();
    private SelenideElement firstNameInput = $("#firstName"),
            setLastName = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapperInput = $("#hobbiesWrapper"),
            currentAddressInput = $("#currentAddress"),
            uploadPictureInput = $("#uploadPicture"),
            stateInput = $("#state"),
            stateCityWrapperInput = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            submitInput = $("#submit");



    public RegisterPage openPage() {
        open("/automation-practice-form");
        return this;

    }
    public RegisterPage cleanBanner () {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;

    }

    public RegisterPage setFirstName(String string) {
        firstNameInput.setValue(string);
        return this;
    }

    public RegisterPage setLastName(String string) {
        setLastName.setValue(string);
        return this;
    }

    public RegisterPage setUserEmail(String string) {
        userEmailInput.setValue(string);
        return this;
    }

    public RegisterPage setGenderWrapper(String string) {
        genderWrapper.$(byText(string)).click();
        return this;
    }

    public RegisterPage setUserNumber(String string) {
        userNumberInput.setValue(string);
        return this;
    }

    public RegisterPage setCalendar(String day, String month, String year) {
        calendarInput.click();
        calendarComponents.components(day, month, year);
        return this;

    }

    public RegisterPage setSubjects(String string) {
        subjectsInput.setValue(string).pressEnter();
        return this;
    }

    public RegisterPage setHobbiesWrapper(String string) {
        hobbiesWrapperInput.$(byText(string)).click();
        return this;
    }

    public RegisterPage setCurrentAddress(String string) {
        currentAddressInput.setValue(string);
        return this;
    }

    public RegisterPage setUploadPicture(String string) {
        uploadPictureInput.uploadFromClasspath(string);
        return this;
    }

    public RegisterPage setState(String state) {
        stateInput.click();
        stateCityWrapperInput.$(byText(state)).click();
        return this;
    }
    public RegisterPage setCity( String city) {
        cityInput.click();
        stateCityWrapperInput.$(byText(city)).click();
        return this;
    }

    public RegisterPage setSubmit() {
        submitInput.click();
        return this;
    }

    public RegisterPage setTableResponsive(String key, String value) {
        registrationPageComponent.checkResults(key, value);
        return this;
    }

    public RegisterPage checkTableNotVisible() {
        registrationPageComponent.checkTableNotVisible();
        return this;
    }
}

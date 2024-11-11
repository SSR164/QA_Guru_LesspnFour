package lessonsix;

import lessonsix.page.RegisterPage;
import org.junit.jupiter.api.Test;


public class RegisterWindowsTests extends TestsBase {
    RegisterPage registerPage = new RegisterPage();
    TestData testData = new TestData();


    @Test
    void testsFullData() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testData.firstName);
        registerPage.setLastName(testData.lastName);
        registerPage.setUserEmail(testData.userEmail);
        registerPage.setGenderWrapper(testData.randomGender.getValue());
        registerPage.setUserNumber(testData.userPhoneNumberCorrect);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth.getValue(), testData.randomYear);
        registerPage.setSubjects(testData.randomSubjects.getValue());
        registerPage.setHobbiesWrapper(testData.randomHobbies.getValue());
        registerPage.setCurrentAddress(testData.streetAddress);
        registerPage.setUploadPicture(testData.randomPage);
        registerPage.setState(testData.randomState.getValue());
        registerPage.setCity(testData.randomCity);
        registerPage.clickSubmit();
        registerPage.checkTableResponsive("Student Name", testData.fullName);
        registerPage.checkTableResponsive("Student Email", testData.userEmail);
        registerPage.checkTableResponsive("Gender", testData.randomGender.getValue());
        registerPage.checkTableResponsive("Mobile", testData.userPhoneNumberCorrect);
        registerPage.checkTableResponsive("Date of Birth", testData.fullDate);
        registerPage.checkTableResponsive("Subjects", testData.randomSubjects.getValue());
        registerPage.checkTableResponsive("Hobbies", testData.randomHobbies.getValue());
        registerPage.checkTableResponsive("Picture", testData.randomPage);
        registerPage.checkTableResponsive("Address", testData.streetAddress);
        registerPage.checkTableResponsive("State and City", testData.stateAndCity);

    }

    @Test
    void testsMinData() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testData.firstName);
        registerPage.setLastName(testData.lastName);
        registerPage.setUserEmail(testData.userEmail);
        registerPage.setGenderWrapper(testData.randomGender.getValue());
        registerPage.setUserNumber(testData.userPhoneNumberCorrect);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth.getValue(), testData.randomYear);
        registerPage.clickSubmit();
        registerPage.checkTableResponsive("Student Name", testData.fullName);
        registerPage.checkTableResponsive("Student Email", testData.userEmail);
        registerPage.checkTableResponsive("Gender", testData.randomGender.getValue());
        registerPage.checkTableResponsive("Mobile", testData.userPhoneNumberCorrect);
        registerPage.checkTableResponsive("Date of Birth", testData.fullDate);

    }

    @Test
    void testsNegativeMobileLetters() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testData.firstName);
        registerPage.setLastName(testData.lastName);
        registerPage.setUserEmail(testData.userEmail);
        registerPage.setGenderWrapper(testData.randomGender.getValue());
        registerPage.setUserNumber(testData.userPhoneNumberNotCorrect);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth.getValue(), testData.randomYear);
        registerPage.clickSubmit();
        registerPage.checkTableNotVisible();
    }

    @Test
    void testsNegativeMobileLMin() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testData.firstName);
        registerPage.setLastName(testData.lastName);
        registerPage.setUserEmail(testData.userEmail);
        registerPage.setGenderWrapper(testData.randomGender.getValue());
        registerPage.setUserNumber(testData.userPhoneNumberMin);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth.getValue(), testData.randomYear);
        registerPage.clickSubmit();
        registerPage.checkTableNotVisible();
    }


}


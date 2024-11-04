package lessonsix;

import lessonsix.page.RegisterPage;
import org.junit.jupiter.api.Test;


public class RegisterWindowsTests extends TestsBase {
    RegisterPage registerPage = new RegisterPage();
    TestData testData =new TestData();


    @Test
    void testsFullData() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testData.firstName);
        registerPage.setLastName(testData.lastName);
        registerPage.setUserEmail(testData.userEmail);
        registerPage.setGenderWrapper(testData.randomGender);
        registerPage.setUserNumber(testData.userPhoneNumberCorrect);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
        registerPage.setSubjects(testData.randomSubjects);
        registerPage.setHobbiesWrapper(testData.randomHobbies);
        registerPage.setCurrentAddress(testData.streetAddress);
        registerPage.setUploadPicture(testData.randomPage);
        registerPage.setState(testData.randomState);
        registerPage.setCity(testData.randomCity);
        registerPage.clickSubmit();
        registerPage.checkTableResponsive("Student Name", testData.fullName);
        registerPage.checkTableResponsive("Student Email", testData.userEmail);
        registerPage.checkTableResponsive("Gender", testData.randomGender);
        registerPage.checkTableResponsive("Mobile", testData.userPhoneNumberCorrect);
        registerPage.checkTableResponsive("Date of Birth", testData.fullDate);
        registerPage.checkTableResponsive("Subjects", testData.randomSubjects);
        registerPage.checkTableResponsive("Hobbies", testData.randomHobbies);
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
        registerPage.setGenderWrapper(testData.randomGender);
        registerPage.setUserNumber(testData.userPhoneNumberCorrect);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
        registerPage.clickSubmit();
        registerPage.checkTableResponsive("Student Name", testData.fullName);
        registerPage.checkTableResponsive("Student Email", testData.userEmail);
        registerPage.checkTableResponsive("Gender", testData.randomGender);
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
        registerPage.setGenderWrapper(testData.randomGender);
        registerPage.setUserNumber(testData.userPhoneNumberNotCorrect);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
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
        registerPage.setGenderWrapper(testData.randomGender);
        registerPage.setUserNumber(testData.userPhoneNumberMin);
        registerPage.chooseCalendar(testData.randomDay, testData.randomMonth, testData.randomYear);
        registerPage.clickSubmit();
        registerPage.checkTableNotVisible();
    }


}


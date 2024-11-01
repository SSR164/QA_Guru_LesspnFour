package lessonsix;

import lessonsix.page.RegisterPage;
import org.junit.jupiter.api.Test;


public class RegisterWindowsTests extends TestsBase {
    RegisterPage registerPage = new RegisterPage();
    TestsData testsData=new TestsData();


    @Test
    void testsFullData() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testsData.firstName);
        registerPage.setLastName(testsData.lastName);
        registerPage.setUserEmail(testsData.userEmail);
        registerPage.setGenderWrapper(testsData.randomGender);
        registerPage.setUserNumber(testsData.userPhoneNumberCorrect);
        registerPage.chooseCalendar(testsData.randomDay, testsData.randomMonth, testsData.randomYear);
        registerPage.setSubjects(testsData.randomSubjects);
        registerPage.setHobbiesWrapper(testsData.randomHobbies);
        registerPage.setCurrentAddress(testsData.streetAddress);
        registerPage.setUploadPicture(testsData.randomPage);
        registerPage.setState(testsData.randomState);
        registerPage.setCity(testsData.randomCity);
        registerPage.clickSubmit();
        registerPage.checkTableResponsive("Student Name", testsData.fullName);
        registerPage.checkTableResponsive("Student Email", testsData.userEmail);
        registerPage.checkTableResponsive("Gender", testsData.randomGender);
        registerPage.checkTableResponsive("Mobile", testsData.userPhoneNumberCorrect);
        registerPage.checkTableResponsive("Date of Birth", testsData.fullDate);
        registerPage.checkTableResponsive("Subjects", testsData.randomSubjects);
        registerPage.checkTableResponsive("Hobbies", testsData.randomHobbies);
        registerPage.checkTableResponsive("Picture", testsData.randomPage);
        registerPage.checkTableResponsive("Address", testsData.streetAddress);
        registerPage.checkTableResponsive("State and City", testsData.stateAndCity);

    }

    @Test
    void testsMinData() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testsData.firstName);
        registerPage.setLastName(testsData.lastName);
        registerPage.setUserEmail(testsData.userEmail);
        registerPage.setGenderWrapper(testsData.randomGender);
        registerPage.setUserNumber(testsData.userPhoneNumberCorrect);
        registerPage.chooseCalendar(testsData.randomDay, testsData.randomMonth, testsData.randomYear);
        registerPage.clickSubmit();
        registerPage.checkTableResponsive("Student Name", testsData.fullName);
        registerPage.checkTableResponsive("Student Email", testsData.userEmail);
        registerPage.checkTableResponsive("Gender", testsData.randomGender);
        registerPage.checkTableResponsive("Mobile", testsData.userPhoneNumberCorrect);
        registerPage.checkTableResponsive("Date of Birth", testsData.fullDate);

    }

    @Test
    void testsNegativeMobileLetters() {
        registerPage.openPage();
        registerPage.cleanBanner();
        registerPage.setFirstName(testsData.firstName);
        registerPage.setLastName(testsData.lastName);
        registerPage.setUserEmail(testsData.userEmail);
        registerPage.setGenderWrapper(testsData.randomGender);
        registerPage.setUserNumber(testsData.userPhoneNumberNotCorrect);
        registerPage.chooseCalendar(testsData.randomDay, testsData.randomMonth, testsData.randomYear);
        registerPage.clickSubmit();
        registerPage.checkTableNotVisible();
    }


}


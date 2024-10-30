package lessonsix;

import lessonsix.page.RegisterPage;
import org.junit.jupiter.api.Test;


public class RegisterWindowsTests extends TestsBase {
    RegisterPage RegisterPage = new RegisterPage();

    @Test
    void testsFullData() {
        RegisterPage.openPage();
        RegisterPage.cleanBanner();
        RegisterPage.setFirstName("firstname");
        RegisterPage.setLastName("lastName");
        RegisterPage.setUserEmail("name@egmail.com");
        RegisterPage.setGenderWrapper("Other");
        RegisterPage.setUserNumber("1234567890");
        RegisterPage.setCalendar("04", "October", "1994");
        RegisterPage.setSubjects("English");
        RegisterPage.setHobbiesWrapper("Sports");
        RegisterPage.setCurrentAddress("Another street 1");
        RegisterPage.setUploadPicture("image.jpg");
        RegisterPage.setState("NCR");
        RegisterPage.setCity("Delhi");
        RegisterPage.setSubmit();
        RegisterPage.setTableResponsive("Student Name", "firstname lastName");
        RegisterPage.setTableResponsive("Student Email", "name@egmail.com");
        RegisterPage.setTableResponsive("Gender", "Other");
        RegisterPage.setTableResponsive("Mobile", "1234567890");
        RegisterPage.setTableResponsive("Date of Birth", "04 October,1994");
        RegisterPage.setTableResponsive("Subjects", "English");
        RegisterPage.setTableResponsive("Hobbies", "Sports");
        RegisterPage.setTableResponsive("Picture", "image.jpg");
        RegisterPage.setTableResponsive("Address", "Another street 1");
        RegisterPage.setTableResponsive("State and City", "NCR Delhi");

    }

    @Test
    void testsMinData() {
        RegisterPage.openPage();
        RegisterPage.cleanBanner();
        RegisterPage.setFirstName("firstname");
        RegisterPage.setLastName("lastName");
        RegisterPage.setUserEmail("name@egmail.com");
        RegisterPage.setGenderWrapper("Other");
        RegisterPage.setUserNumber("1234567890");
        RegisterPage.setCalendar("04", "October", "1994");
        RegisterPage.setSubmit();
        RegisterPage.setTableResponsive("Student Name", "firstname lastName");
        RegisterPage.setTableResponsive("Student Email", "name@egmail.com");
        RegisterPage.setTableResponsive("Gender", "Other");
        RegisterPage.setTableResponsive("Mobile", "1234567890");
        RegisterPage.setTableResponsive("Date of Birth", "04 October,1994");

    }

    @Test
    void testsNegativeMobileLetters() {
        RegisterPage.openPage();
        RegisterPage.cleanBanner();
        RegisterPage.setFirstName("firstname");
        RegisterPage.setLastName("lastName");
        RegisterPage.setUserEmail("name@egmail.com");
        RegisterPage.setGenderWrapper("Other");
        RegisterPage.setUserNumber("qwertyuiop");
        RegisterPage.setCalendar("04", "October", "1994");
        RegisterPage.setSubmit();
        RegisterPage.checkTableNotVisible();
    }


}


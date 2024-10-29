import org.junit.jupiter.api.Test;
import page.LessonSixRegisterPage;
import page.LessonSixTestsBase;

public class LessonSixTestsRegisterWindows extends LessonSixTestsBase {
    LessonSixRegisterPage lessonSixRegisterPage= new LessonSixRegisterPage();
    @Test
void testsFullData() {
        lessonSixRegisterPage.openPage();
        lessonSixRegisterPage.firstNameInput("firstname");
        lessonSixRegisterPage.lastNameInput("lastName");
        lessonSixRegisterPage.userEmailInput("name@egmail.com");
        lessonSixRegisterPage.genderWrapper("Other");
        lessonSixRegisterPage.userNumberInput("1234567890");
        lessonSixRegisterPage.calendarInput("04","October","1994");
        lessonSixRegisterPage.subjectsInput("English");
        lessonSixRegisterPage.hobbiesWrapperInput("Sports");
        lessonSixRegisterPage.currentAddressInput("Another street 1");
        lessonSixRegisterPage.uploadPictureInput("image.jpg");
        lessonSixRegisterPage.stateAndCityInput("NCR","Delhi");
        lessonSixRegisterPage.submitInput();
        lessonSixRegisterPage.tableResponsive( "Student Name","firstname lastName");
        lessonSixRegisterPage.tableResponsive("Student Email","name@egmail.com");
        lessonSixRegisterPage.tableResponsive("Gender","Other");
        lessonSixRegisterPage.tableResponsive("Mobile","1234567890");
        lessonSixRegisterPage.tableResponsive("Date of Birth","04 October,1994");
        lessonSixRegisterPage.tableResponsive("Subjects","English");
        lessonSixRegisterPage.tableResponsive("Hobbies","Sports");
        lessonSixRegisterPage.tableResponsive("Picture","image.jpg");
        lessonSixRegisterPage.tableResponsive("Address","Another street 1");
        lessonSixRegisterPage.tableResponsive("State and City","NCR Delhi");

}
@Test
void testsMinData(){
        lessonSixRegisterPage.openPage();
        lessonSixRegisterPage.firstNameInput("firstname");
        lessonSixRegisterPage.lastNameInput("lastName");
        lessonSixRegisterPage.genderWrapper("Other");
        lessonSixRegisterPage.userNumberInput("1234567890");
        lessonSixRegisterPage.calendarInput("04","October","1994");
        lessonSixRegisterPage.submitInput();
        lessonSixRegisterPage.tableResponsive( "Student Name","firstname lastName");
        lessonSixRegisterPage.tableResponsive("Gender","Other");
        lessonSixRegisterPage.tableResponsive("Mobile","1234567890");
        lessonSixRegisterPage.tableResponsive("Date of Birth","04 October,1994");

        }
        @Test
void testsNegativeMobileLetters(){
        lessonSixRegisterPage.openPage();
        lessonSixRegisterPage.firstNameInput("firstname");
        lessonSixRegisterPage.lastNameInput("lastName");
        lessonSixRegisterPage.genderWrapper("Other");
        lessonSixRegisterPage.userNumberInput("qwertyuiop");
        lessonSixRegisterPage.calendarInput("04","October","1994");
        lessonSixRegisterPage.submitInput();
        lessonSixRegisterPage.tableNotVisible();


}


}


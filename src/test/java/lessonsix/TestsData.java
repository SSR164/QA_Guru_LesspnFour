package lessonsix;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class TestsData {
    Random random =new Random();
    String tenLetterify="??????????";
    Faker faker = new Faker(new Locale("en-GB"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String fullName = String.format("%s %s", firstName, lastName);
    String[] gender ={"Male","Female","March","Other"};
    int randomIndexGender = random.nextInt(gender.length);
    String randomGender = gender[randomIndexGender];
    String userEmail = faker.internet().emailAddress();
    String streetAddress = faker.address().streetAddress();
    String userPhoneNumberCorrect= faker.number().digits(10);
    String userPhoneNumberNotCorrect=faker.letterify(tenLetterify);
    String[] month ={"January","February","March","April","May","June","July","August","September","October","November","December"};
    int randomIndexMonth = random.nextInt(month.length);
    String randomMonth = month[randomIndexMonth];
    String randomYear = String.valueOf (random.nextInt(1900,2100));

    String getRandomDay(String month){
        String thirteenthOneDay = String.valueOf(faker.number().numberBetween(1, 31));
        String twentyEightDay = String.valueOf(faker.number().numberBetween(1, 28));
        String thirteenDay = String.valueOf(faker.number().numberBetween(1, 30));
        String randomDay;
        switch (month) {
            case "January":
               randomDay = thirteenthOneDay;
                break;
            case "March":
                randomDay = thirteenthOneDay;
                break;
            case "May":
                randomDay = thirteenthOneDay;
                break;
            case "July":
                randomDay = thirteenthOneDay;
                break;
            case "August":
                 randomDay = thirteenthOneDay;
                break;
            case "October":
                 randomDay = thirteenthOneDay;
                break;
            case "December":
                randomDay = thirteenthOneDay;
                break;
            case "April":
                randomDay = thirteenDay;
                break;
            case "June":
                randomDay = thirteenDay;
                break;
            case "September":
                 randomDay = thirteenDay;
                break;
            case "November":
                 randomDay = thirteenDay;
                break;
            case "February":
                randomDay = twentyEightDay ;
                break;
            default:
                return "Некорректный месяц";
        }
        return randomDay;
    }
    String randomDay=getRandomDay(randomMonth);
    String[] subjects ={"Accounting","Social Studies","Arts","English","Chemistry","Computer Science","Commerce","Economics","Social Studies","History","Hindi"};
    int randomIndexSubjects = random.nextInt(subjects.length);
    String randomSubjects = subjects[randomIndexSubjects];
    String[] hobbies ={"Sports","Reading","Music"};
    int randomIndexHobbies = random.nextInt(hobbies.length);
    String randomHobbies = hobbies[randomIndexHobbies];


}

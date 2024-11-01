package lessonsix;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class TestsData {
    Random random = new Random();
    String tenLetterify = "??????????";
    Faker faker = new Faker(new Locale("en-GB"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String fullName = String.format("%s %s", firstName, lastName);
    String[] gender = {"Male", "Female", "Other"};
    int randomIndexGender = random.nextInt(gender.length);
    String randomGender = gender[randomIndexGender];
    String userEmail = faker.internet().emailAddress();
    String streetAddress = faker.address().streetAddress();
    String userPhoneNumberCorrect = faker.number().digits(10);
    String userPhoneNumberNotCorrect = faker.letterify(tenLetterify);
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int randomIndexMonth = random.nextInt(month.length);
    String randomMonth = month[randomIndexMonth];
    String randomYear = String.valueOf(random.nextInt(1930, 2024));

    String getRandomDay(String month) {
        int thirteenthOneDay = faker.number().numberBetween(1, 31);
        int thirteenDay = faker.number().numberBetween(1, 30);
        int twentyEightDay = faker.number().numberBetween(1, 28);
        int randomDay;
        String randomDayStr;
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
                randomDay = twentyEightDay;
                break;
            default:
                return "Некорректный месяц";
        }
        if (randomDay < 10) {
            randomDayStr = 0 + String.valueOf(randomDay);
            return randomDayStr;
        } else {
            return String.valueOf(randomDay);
        }
    }

    String randomDay = getRandomDay(randomMonth);
    String fullDate = String.format("%s %s,%s", randomDay, randomMonth, randomYear);
    String[] subjects = {"Accounting", "Social Studies", "Arts", "English", "Chemistry", "Computer Science", "Commerce", "Economics", "Social Studies", "History", "Hindi"};
    int randomIndexSubjects = random.nextInt(subjects.length);
    String randomSubjects = subjects[randomIndexSubjects];
    String[] hobbies = {"Sports", "Reading", "Music"};
    int randomIndexHobbies = random.nextInt(hobbies.length);
    String randomHobbies = hobbies[randomIndexHobbies];
    String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    int randomIndexState = random.nextInt(state.length);
    String randomState = state[randomIndexState];

    String getRandomCity(String state) {
        String resultGetRandomCity = "";
        if (state.equals("NCR")) {
            String[] cityNCR = {"Delhi", "Gurgaon", "Noida"};
            int randomIndexcityNCR = random.nextInt(cityNCR.length);
            String randomCityNCR = cityNCR[randomIndexcityNCR];
            resultGetRandomCity = randomCityNCR;

        } else if (state.equals("Uttar Pradesh")) {
            String[] cityUttarPradesh = {"Agra", "Lucknow", "Merrut"};
            int randomIndexCityUttarPradesh = random.nextInt(cityUttarPradesh.length);
            String randomCityUttarPradesh = cityUttarPradesh[randomIndexCityUttarPradesh];
            resultGetRandomCity = randomCityUttarPradesh;

        } else if (state.equals("Haryana")) {
            String[] cityHaryana = {"Karnal", "Panipat"};
            int randomIndexCityHaryana = random.nextInt(cityHaryana.length);
            String randomCityHaryana = cityHaryana[randomIndexCityHaryana];
            resultGetRandomCity = randomCityHaryana;

        } else if (state.equals("Rajasthan")) {
            String[] cityRajasthan = {"Jaipur", "Jaiselmer"};
            int randomIndexCityRajasthan = random.nextInt(cityRajasthan.length);
            String randomCityRajasthan = cityRajasthan[randomIndexCityRajasthan];
            resultGetRandomCity = randomCityRajasthan;

        }

        return resultGetRandomCity;
    }
    String randomCity=getRandomCity(randomState);
    String stateAndCity= String.format("%s %s", randomState,randomCity);

    String[] page = {"pageOne.jpg", "pageTwo.jpg", "pageThree.jpg"};
    int randomIndexPage = random.nextInt(page.length);
    String randomPage= page[randomIndexPage];
}
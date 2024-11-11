package lessonsix;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestData {
    enum Month {
        JANUARY("January"),
        FEBRUARY("February"),
        MARCH("March"),
        APRIL("April"),
        MAY("May"),
        JUNE("June"),
        JULY("July"),
        AUGUST("August"),
        SEPTEMBER("September"),
        OCTOBER("October"),
        NOVEMBER("November"),
        DECEMBER("December");

        private String value;

        Month(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum Gender {
        MALE("Male"),
        FEMALE("Female"),
        OTHER("Other");


        private String value;

        Gender(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum Hobbi {
        SPORTS("Sports"),
        READING("Reading"),
        MUSIC("Music");


        private String value;

        Hobbi(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum Subject {
        ACCOUNTING("Accounting"),
        SOCIALSTUDIES("Social Studies"),
        ARTS("Arts"),
        ENGLISH("English"),
        CHEMISTRY("Chemistry"),
        COMPUTERSCIENCE("Computer Science"),
        COMMERCE("Commerce"),
        ECONOMICS("Economics"),
        SOCIALSTUDIE("Social Studies"),
        HISTORY("History"),
        HINDI("Hindi");


        private String value;

        Subject(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum State {
        NCR("NCR"),
        UTTARPRADESH("Uttar Pradesh"),
        HARYANA("Haryana"),
        RAJASTHAN("Rajasthan");

        private String value;

        State(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum CityNCR {
        DELHI("Delhi"),
        GURGAON("Gurgaon"),
        NOIDA("Noida");


        private String value;

        CityNCR(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum CityUttarPradesh {
        AGRA("Agra"),
        LUCKNOW("Lucknow"),
        MERRUT("Merrut");


        private String value;

        CityUttarPradesh(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum CityHaryana {
        KARNAL("Karnal"),
        PANIPAT("Panipat");


        private String value;

        CityHaryana(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum CityRajasthan {
        JAIPUR("Jaipur"),
        JAISELMER("Jaiselmer");


        private String value;

        CityRajasthan(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    Random random = new Random();
    String tenLetterify = "??????????";
    Faker faker = new Faker(new Locale("en-GB"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String fullName = String.format("%s %s", firstName, lastName);
    String randomGender = getRandomGender();
    String userEmail = faker.internet().emailAddress();
    String streetAddress = faker.address().streetAddress();
    String userPhoneNumberCorrect = faker.number().digits(10);
    String userPhoneNumberMin = faker.number().digits(9);
    String userPhoneNumberNotCorrect = faker.letterify(tenLetterify);
    String randomMonth = getRandomMonth();
    String randomYear = String.valueOf(random.nextInt(1930, 2024));
    String randomDay = getRandomDay(randomMonth);
    String fullDate = String.format("%s %s,%s", randomDay, randomMonth, randomYear);
    String randomSubjects = getRandomSubjects();
    String randomHobbies = getRandomHobbies();
    String randomState = getRandomState();
    String randomCity = getRandomCity(randomState);
    String stateAndCity = String.format("%s %s", randomState, randomCity);
    String[] page = {"pageOne.jpg", "pageTwo.jpg", "pageThree.jpg"};
    int randomIndexPage = random.nextInt(page.length);
    String randomPage = page[randomIndexPage];

    String getRandomGender() {
        return Gender.values()[ThreadLocalRandom.current().nextInt(0, Gender.values().length)].getValue();
    }

    String getRandomMonth() {
        return Month.values()[ThreadLocalRandom.current().nextInt(0, Month.values().length)].getValue();
    }

    String getRandomDay(String month) {
        int thirteenthOneDay = faker.number().numberBetween(1, 31);
        int thirteenDay = faker.number().numberBetween(1, 30);
        int twentyEightDay = faker.number().numberBetween(1, 28);
        int randomDay;
        String randomDayStr;
        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> randomDay = thirteenthOneDay;
            case "April", "June", "September", "November" -> randomDay = thirteenDay;
            case "February" -> randomDay = twentyEightDay;
            default -> randomDay = thirteenthOneDay;
        }
        if (randomDay < 10) {
            randomDayStr = 0 + String.valueOf(randomDay);
            return randomDayStr;
        } else {
            return String.valueOf(randomDay);
        }
    }

    String getRandomSubjects() {
        return Subject.values()[ThreadLocalRandom.current().nextInt(0, Subject.values().length)].getValue();
    }

    String getRandomHobbies() {
        return Hobbi.values()[ThreadLocalRandom.current().nextInt(0, Hobbi.values().length)].getValue();
    }

    String getRandomState() {
        return State.values()[ThreadLocalRandom.current().nextInt(0, State.values().length)].getValue();
    }

    String getRandomCity(String state) {
        String resultGetRandomCity;

        switch (state) {
            case "NCR" -> resultGetRandomCity = CityNCR.values()[ThreadLocalRandom.current().nextInt(0, CityNCR.values().length)].getValue();
            case "Uttar Pradesh" -> resultGetRandomCity = CityUttarPradesh.values()[ThreadLocalRandom.current().nextInt(0, CityUttarPradesh.values().length)].getValue();
            case "Haryana" -> resultGetRandomCity = CityHaryana.values()[ThreadLocalRandom.current().nextInt(0, CityHaryana.values().length)].getValue();
            case "Rajasthan" -> resultGetRandomCity = CityRajasthan.values()[ThreadLocalRandom.current().nextInt(0, CityRajasthan.values().length)].getValue();
            default -> resultGetRandomCity = "";
        }
        return resultGetRandomCity;
    }
}

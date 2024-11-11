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
    Gender randomGender = getRandomGender();
    String userEmail = faker.internet().emailAddress();
    String streetAddress = faker.address().streetAddress();
    String userPhoneNumberCorrect = faker.number().digits(10);
    String userPhoneNumberMin = faker.number().digits(9);
    String userPhoneNumberNotCorrect = faker.letterify(tenLetterify);
    Month randomMonth = getRandomMonth();
    String randomYear = String.valueOf(random.nextInt(1930, 2024));
    String randomDay = getRandomDay(randomMonth);
    String fullDate = String.format("%s %s,%s", randomDay, randomMonth, randomYear);
    Subject randomSubjects = getRandomSubjects();
    Hobbi randomHobbies = getRandomHobbies();
    State randomState = getRandomState();
    String randomCity = getRandomCity(randomState);
    String stateAndCity = String.format("%s %s", randomState, randomCity);
    String[] page = {"pageOne.jpg", "pageTwo.jpg", "pageThree.jpg"};
    int randomIndexPage = random.nextInt(page.length);
    String randomPage = page[randomIndexPage];

    Gender getRandomGender() {
        return getRandomEnum(Gender.class);
    }

    Month getRandomMonth() {
        return getRandomEnum(Month.class);
    }

    String getRandomDay(Month month) {
        int thirteenthOneDay = faker.number().numberBetween(1, 31);
        int thirteenDay = faker.number().numberBetween(1, 30);
        int twentyEightDay = faker.number().numberBetween(1, 28);
        int randomDay = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> thirteenthOneDay;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> thirteenDay;
            case FEBRUARY -> twentyEightDay;
        };
        return randomDay < 10 ? 0 + String.valueOf(randomDay) : String.valueOf(randomDay);
    }

    Subject getRandomSubjects() {
        return getRandomEnum(Subject.class);
    }

    Hobbi getRandomHobbies() {
        return getRandomEnum(Hobbi.class);
    }

    State getRandomState() {
        return getRandomEnum(State.class);
    }

    String getRandomCity(State state) {
        return switch (state) {
            case NCR -> getRandomEnum(CityNCR.class).getValue();
            case UTTARPRADESH -> getRandomEnum(CityUttarPradesh.class).getValue();
            case HARYANA -> getRandomEnum(CityHaryana.class).getValue();
            case RAJASTHAN -> getRandomEnum(CityRajasthan.class).getValue();
        };
    }

    <T extends Enum<?>> T getRandomEnum(Class<T> clazz) {
        T[] enumConstants = clazz.getEnumConstants();
        int randomIndex = ThreadLocalRandom.current().nextInt(0, enumConstants.length);
        return enumConstants[randomIndex];
    }
}

package lessonsix;

import static lessonsix.TestData.State.HARYANA;
import static lessonsix.TestData.State.NCR;
import static lessonsix.TestData.State.RAJASTHAN;
import static lessonsix.TestData.State.UTTARPRADESH;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

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

        private final String value;

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


        private final String value;

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


        private final String value;

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


        private final String value;

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

        private final String value;

        State(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    enum City {
        DELHI("Delhi", NCR),
        GURGAON("Gurgaon", NCR),
        NOIDA("Noida", NCR),
        AGRA("Agra", UTTARPRADESH),
        LUCKNOW("Lucknow", UTTARPRADESH),
        MERRUT("Merrut", UTTARPRADESH),
        KARNAL("Karnal", HARYANA),
        PANIPAT("Panipat", HARYANA),
        JAIPUR("Jaipur", RAJASTHAN),
        JAISELMER("Jaiselmer", RAJASTHAN);

        City(String value, State state) {
            this.value = value;
            this.state = state;
        }

        private final String value;
        private final State state;

        public String getValue() {
            return value;
        }

        public State getState() {
            return state;
        }
    }

    Map<State, List<City>> cityByState = Arrays.stream(City.values())
            .collect(Collectors.groupingBy(City::getState));
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
    String randomPage = getRandomArrayElement(new String[]{"pageOne.jpg", "pageTwo.jpg", "pageThree.jpg"});

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
        return getRandomArrayElement(
                cityByState.get(state)
                        .toArray(City[]::new))
                .getValue();
    }

    <T extends Enum<?>> T getRandomEnum(Class<T> clazz) {
        return getRandomArrayElement(clazz.getEnumConstants());
    }

    <T> T getRandomArrayElement(T[] array) {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, array.length);
        return array[randomIndex];
    }
}

package People;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person test;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test = new Person("Test","Person",new GregorianCalendar(1999, Calendar.DECEMBER, 11));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void findAgeOfPerson() {
        int expectedOutput = 23;
        int actualOutput = test.findAgeOfPerson();
        assertEquals(expectedOutput, actualOutput);
    }

    @org.junit.jupiter.api.Test
    void millisToYears() {
        long millis = 31557600000L;
        int expectedOutput = 1;
        int actualOutput = test.millisToYears(millis);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void setFirstName() {
        test.setFirstName("random");
        String expectedOutput = "random";
        String actualOutput = test.getFirstName();
        assertEquals(expectedOutput, actualOutput );
    }

    @org.junit.jupiter.api.Test
    void formatDate() {
        String expectedOutput = "11-Dec-1999";
        String actualOutput = test.formatDate(test.getDateOfBirth());
        assertEquals(expectedOutput,actualOutput);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String expectedOutput = "Name: Test Person Age: 23 Date Of Birth: 11-Dec-1999";
        String actualOutput = test.toString();
        assertEquals(expectedOutput,actualOutput );
    }
}
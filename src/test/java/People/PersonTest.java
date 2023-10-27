package People;

import org.junit.jupiter.api.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person test;

    @BeforeEach
    void setUp() {
        test = new Person("Test","Person",new GregorianCalendar(1999, Calendar.DECEMBER, 11));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAgeOfPerson() {
        int expectedOutput = 23;
        int actualOutput = test.findAgeOfPerson();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
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

    @Test
    void formatDate() {
        String expectedOutput = "11-Dec-1999";
        String actualOutput = test.formatDate(test.getDateOfBirth());
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void testToString() {
        String expectedOutput = "Name: Test Person Age: 23 Date Of Birth: 11-Dec-1999";
        String actualOutput = test.toString();
        assertEquals(expectedOutput,actualOutput );
    }
}
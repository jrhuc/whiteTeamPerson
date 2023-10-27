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
        assertEquals(23,test.findAgeOfPerson());
    }

    @org.junit.jupiter.api.Test
    void millisToYears() {
//        long millis = 31557600000L;
        assertEquals(1,test.millisToYears(31557600000L));
    }

    @Test
    void setFirstName() {
        test.setFirstName("random");
        assertEquals("random", test.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void formatDate() {
        assertEquals("11-Dec-1999",test.formatDate(test.getDateOfBirth()));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Name: Test Person Age: 23 Date Of Birth: 11-Dec-1999", test.toString());
    }
}
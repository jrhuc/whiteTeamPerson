package People;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person test;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test = new Person("Test","Person",new GregorianCalendar(1999, 11, 11));
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
    }

    @org.junit.jupiter.api.Test
    void formatDate() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}
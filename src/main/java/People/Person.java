package People;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class representing a Person Object
 */

public class Person {

    private String firstName;
    private String lastName;
    private GregorianCalendar dateOfBirth;

    public static int personCount;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

   /* public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }*/

    /**
     * Returns the person's current age by checking their date of birth
     *
     * @return an int representing the age
     */
    public int findAgeOfPerson() {
        return millisToYears(System.currentTimeMillis() - dateOfBirth.getTimeInMillis());
    }

    public Person(String firstName, String lastName, GregorianCalendar dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        personCount++;
    }

    /**
     * Converts a time in milliseconds into years
     *
     * @param milliseconds a long representing time in milliseconds
     * @return an integer representing this time in years, rounded down
     */
    public int millisToYears(long milliseconds) {
        milliseconds = milliseconds / 315576;
        return (int) milliseconds / 100000;
    }

    /**
     * Takes in a calendar parameter and returns a formatted String representing the UTC date format
     *
     * @param calendar a calendar object containing a date of birth
     * @return a String in the dd-MMM-yyyy format
     */

    public String formatDate(Calendar calendar) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(calendar);

        return fmt.format(calendar.getTime());
    }

    /**
     * Overrides the default toString method
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Age: " + findAgeOfPerson() + " Date Of Birth: " + formatDate(dateOfBirth);
    }
}
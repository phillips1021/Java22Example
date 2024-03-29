import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;

/**
 * The Helper class provides methods to assist with various tasks.
 */
public class Helper {

    private Person helpee;
    public void help() {
        System.out.println("Hello from Helper");

        helpee = new Person("John", "Doe", 30, DayOfWeek.FRIDAY);

        System.out.println("Helpee: " + helpee);

        System.out.printf("Is pay day for %s today? %s%n", helpee.firstName(), isTodayPayDay());
    }

    /**
     * Checks if today is the pay day for the helpee.
     *
     * @return true if today is the pay day, false otherwise.
     */
    public boolean isTodayPayDay() {
        DayOfWeek currentDayOfWeek = Instant.now().atZone(ZoneId.systemDefault()).getDayOfWeek();
        return currentDayOfWeek.equals(helpee.payDay());
    }
}
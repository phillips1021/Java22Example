import java.time.DayOfWeek;

public record Person(String firstName, String lastName, int age, DayOfWeek payDay) {
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

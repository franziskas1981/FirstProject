import java.time.LocalDate;
import java.time.LocalTime;

public class Hello {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        LocalTime time = LocalTime.now();
        String greeting;
        int hour = time.getHour();

        if (hour >= 12 && hour <= 18) {
            greeting = "Good Afternoon!";
        } else if (hour >=18) {
            greeting = "Good Evening!";
        }
        else {
            greeting = "Good Morning!";
        }
        System.out.println("Hello World! "+greeting+" Today is "+current+ " and it's currently " +time);
    }
}
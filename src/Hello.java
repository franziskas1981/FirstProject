import java.time.LocalDate;
import java.time.LocalTime;

public class Hello {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now(); //get current Date
        LocalTime time = LocalTime.now(); // get current Time
        String greeting; // initialise string to add greeting
        int hour = time.getHour(); // get the hour of the current time

        if (hour >= 12 && hour <= 18) {  // if it's after noon, but before 6pm, greeting is "Good Afternoon"
            greeting = "Good Afternoon!";
        } else if (hour >=18) {
            greeting = "Good Evening!"; // after 6pm greeting is "Good Evening"
        }
        else {
            greeting = "Good Morning!"; // else greeting is "Good Morning"
        }
        System.out.println("Hello World! "+greeting+" Today is "+current+ " and it's currently " +time); // print line with greeting, current Date and current time
    }
}
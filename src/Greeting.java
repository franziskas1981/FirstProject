import java.time.LocalDate;
import java.time.LocalTime;

public class Greeting {
    private String greeting;

    public void calcGreeting() {
        LocalTime time = LocalTime.now(); // get current Time
        int hour = time.getHour(); // get the hour of the current time
        if (hour >= 12 && hour <= 18) {  // if it's after noon, but before 6pm, greeting is "Good Afternoon"
            this.greeting = "Good Afternoon!";
        } else if (hour >= 18) {
            this.greeting = "Good Evening!"; // after 6pm greeting is "Good Evening"
        } else {
            this.greeting = "Good Morning!"; // else greeting is "Good Morning"
        }
    }

    public String getGreeting(){
        return this.greeting;
    }

    public void setGreeting(String g){
        this.greeting = g;
    }

}







import java.time.LocalDate;
import java.time.LocalTime;

public class Greeting {
    private String greeting;

    public void calcGreeting(int h) {
        if (h >= 12 && h <= 18) {  // if it's after noon, but before 6pm, greeting is "Good Afternoon"
            this.greeting = "Good Afternoon!";
        } else if (h >= 18) {
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







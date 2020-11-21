import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now(); //get current Date
        LocalTime time = LocalTime.now(); // get current Time
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        Greeting greetz = new Greeting();

        System.out.println("What is your name?"); // ask user for name
        String name = input.nextLine(); // read name
        person.setName(name); // set name of user
        greetz.calcGreeting(time.getHour()); // choose Greeting based on Time of Day
        System.out.println("Hello "+person.getName()+"! "+greetz.getGreeting()+" Today is "+current+ " and it's currently " +time); // print line with greeting, current Date and current time
    }
}
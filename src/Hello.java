import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now(); //get current Date
        LocalTime time = LocalTime.now(); // get current Time
        Scanner input = new Scanner(System.in);
        Person helloworld = new Person();
        Greeting greetz = new Greeting();

        System.out.println("What is your name?");
        String name = input.next();
        helloworld.setName(name);
        greetz.calcGreeting();
        System.out.println("Hello "+helloworld.getName()+"! "+greetz.getGreeting()+" Today is "+current+ " and it's currently " +time); // print line with greeting, current Date and current time
    }
}
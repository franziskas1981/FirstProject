import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now(); //get current Date
        LocalTime time = LocalTime.now(); // get current Time
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        Greeting greetz = new Greeting();
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("What is your name?"); // ask user for name
        String name = input.nextLine(); // read name
        person.setName(name); // set name of user
        greetz.calcGreeting(time.getHour()); // choose Greeting based on Time of Day
        System.out.println(greetz.getGreeting() + person.getName()+"! When were you born? (yyyy/mm/dd)");
        String userbd = input.nextLine();  //read birthdate
        LocalDate bd = LocalDate.parse(userbd, d); // parse input date to dateformat
        person.setBirthdate(bd);
        System.out.println("You are "+person.getAge()+ " years old today!");
    }
}
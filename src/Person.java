import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private int age;
    private LocalDate birthdate;

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        this.age = a;
    }

    public void setBirthdate(LocalDate d){
        this.birthdate = d;
        calcAge(d, LocalDate.now());
    }

    public LocalDate getBirthdate(){
        return this.birthdate;
    }

    public void calcAge(LocalDate bd, LocalDate currentDate){
        if ((bd != null) && (currentDate != null)) {
            this.age = Period.between(bd, currentDate).getYears();
        } else {
            this.age = 0;
        }
    }

}

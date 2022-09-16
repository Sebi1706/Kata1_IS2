package kata1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
//import static java.time.Period.between;

public class Person {
    private final String name;
    private final LocalDate birthDate;
    

    
    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        return (int) Period.between(birthDate, today).getYears();
    } 
}

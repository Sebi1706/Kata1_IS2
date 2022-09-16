package kata1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Kata1 {
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(2001, Month.JUNE, 17);
        
        Person person = new Person("Juan",date);
        System.out.println(person.getName() + " tiene " +person.getAge()+ " años");
    }
}
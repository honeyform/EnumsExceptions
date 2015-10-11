package Persons;

import java.time.LocalDate;

/**
 * Created by Honey on 11.10.2015.
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("Nastya", "Sokirko", LocalDate.now());
        System.out.println(person.toString());

        Person person2 = new Person("Nas$tya", "Sokirko", LocalDate.now());
        System.out.println(person.toString());

    }
}

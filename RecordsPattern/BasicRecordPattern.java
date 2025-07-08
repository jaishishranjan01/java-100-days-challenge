package RecordsPattern;

import java.util.List;

/**
 * @author jaishishranjan
 * @topic Records Pattern
 * @requirement: Filter and Log Users Based on Age and Location
 * Given: A list of User objects
 * Goal: Write logic to:
 *
 * Print the name and city of users who:
 * Are 18 years or older
 * Live in Bangalore
 *
 * Use record pattern matching with nested destructuring (instanceof and/or switch).
 *
 * Avoid explicit casting and getter calls (user.name(), etc.).
 */
public class BasicRecordPattern {

    public static void main(String args[]) {
        List users = List.of(
                new User("Jaishish", 30, new User.Address("Banglore", 560037)),
                new User("Sneha", 20, new User.Address("Banglore", 560036)),
                new User("Manish", 28, new User.Address("New Delhi", 110067)),
                new User("Shubham", 25, new User.Address("Bihar Sharif", 803101))
        );

        //Basic way (Naive way)
        // Did you notice the string template
        for (Object obj : users) {
            if (obj instanceof User(String name, int age, User.Address(String city, int zip))){
                if (age >= 18 && city.equals("Banglore")) {
                    System.out.println(STR."Eligible: \{name} from \{city}");
                }
            }
        }

        // Best way in case you have multiple condition
        System.out.println("\nWith switch statement");

        for (Object obj : users) {
            switch (obj) {
                case User(String name, int age, User.Address(String city, int zip))
                    when age >= 18 && city.equals("Banglore") -> 
                        System.out.println(STR."Eligible: \{name} from \{city}");
                default -> {} //ignore others
            }
        }
    }

}

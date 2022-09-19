package src;
/*Given person age, Write a function that will print if the person is kid , teen or adult.
-teen if age is between 13 and 19 inclusive.
-kid if less than 13.
-adult if more than 19.*/

public class Person {


    void checkage(int a) {
        if (a > 19) {
            System.out.println("Adult");

        } else if (a < 13) {
            System.out.println("Kid");

        } else {
            System.out.println("Teen");

        }
    }
}


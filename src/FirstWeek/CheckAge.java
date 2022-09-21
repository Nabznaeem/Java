package src.FirstWeek;
/*Given person age, Write a function that will print if the person is kid , teen or adult.
-teen if age is between 13 and 19 inclusive.
-kid if less than 13.
-adult if more than 19.*/

import java.util.Scanner;

public class CheckAge {
    static void checkage(int a) {
        if (a > 19) {
            System.out.println("Adult");

        } else if (a < 13) {
            System.out.println("Kid");

        } else {
            System.out.println("Teen");

        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter age to determine if person is kid,teen or adult");
        int age = s.nextInt();
        checkage(age);

    }
}
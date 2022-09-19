package src;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

        Person p = new Person();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age to determine if person is kid,teen or adult");
        int age = s.nextInt();
        p.checkage(age);
    }
}
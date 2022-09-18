package src;
//Write a program to print your name to console.
import java.util.*;

public class printName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String username= s.nextLine();
        System.out.println("Name is :"+ username);
    }
}

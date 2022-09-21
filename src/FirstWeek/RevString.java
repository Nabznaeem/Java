package src.FirstWeek;

import java.util.Scanner;

//Given a string, write a program to reverse a string. do not use reverse function.
public class RevString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();
        for (int i = str.length()-1;i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
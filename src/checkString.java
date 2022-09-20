package src;
/*Given a Sentence and a String, write a program to check if the sentence contains the String.
input - "I am learning Java" , and "Java"
output - True
 */

import java.util.Scanner;

public class checkString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string 1:");
        String str1 = s.nextLine();
        System.out.println("Enter the string 2: ");
        String str2 = s.nextLine();
        // String str1="I am learning Java";
        //String str2="Java";
        boolean i= str1.contains(str2);
        if(i)
            System.out.println("True.String 1 contains String 2");
        else
            System.out.println("False. String 1 does not contain String 2");
    }
}

package src.FirstWeek;
//Given a string, write a program to find number of vowels in that string.
import java.util.Scanner;

public class Vowels {
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = s.nextLine();
            str = str.toLowerCase();
            int n = 0;

            for (int i = 0; i < str.length(); i++) {
                // check if char[i] is vowel
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    n++;
                }
            }
            System.out.println("Total no of vowels in string are: " + n);
        }
    }

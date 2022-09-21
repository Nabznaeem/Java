package src.SecondWeek;

import java.util.Scanner;

public class palindrome {
    static boolean Palin(String str) {
          int i = 0, j = str.length() - 1;
          while (i < j) {

              if (str.charAt(i) != str.charAt(j))
                  return false;
              i++;
              j--;
          }
          return true;
      }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();
        str = str.toLowerCase();
        if (Palin(str))
        {
            System.out.println("String is palindrome");
        }
        else
        {
                System.out.println("Not palindrome");
        }
    }

}
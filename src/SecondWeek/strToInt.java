package src.SecondWeek;

import java.util.*;
//Given a String, convert to int.
//- example Input "35" , convert it to -- int i = 35.
public class strToInt {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your String to convert to integer:");
        String str=s.nextLine();
        int i= Integer.parseInt(str);
        System.out.println("Value in integer:"+i);
    }
}

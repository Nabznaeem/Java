package src.thirdweek;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

//Using lambdas, Write a program to print number repetitions of a character in a given string.
//Example: input= "This is a test"
//output: i: 2, t: 3, h:1, s:3, a:1, e:1
public class repetition {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = s.nextLine();

        Arrays.stream(s1.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));


    }
}

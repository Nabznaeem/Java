package src.SecondWeek;

import java.util.ArrayList;
import java.util.Collections;

//Given an ArrayList of Strings and two indices, write a program to swap the two Strings at the given indices.
public class ArrayL {
    public static void main(String[] args) {

            ArrayList<String> Arr = new ArrayList<>();

            Arr.add("Str 1");
            Arr.add("Str 2");
            Arr.add("Str 3");
            Arr.add("Str 4");
            Arr.add("Str 5");

            System.out.println("Before swap the ArrayList ");
            System.out.println(Arr);

            Collections.swap(Arr, 1, 2);

            System.out.println("After swap the ArrayList");
            System.out.println(Arr);
        }
    }

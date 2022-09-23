package src.SecondWeek;

import java.util.ArrayList;

//Write a program to remove the last object in the ArrayList.
public class RemLast {
    public static void main(String[] args) {
        ArrayList<String> AList = new ArrayList<>();

        AList.add("Str 1");
        AList.add("Str 2");
        AList.add("Str 3");
        AList.add("Str 4");
        AList.add("Str 5");

        System.out.println("Before removing the last element ArrayList ");
        System.out.println(AList);
        int i=AList.size();
        AList.remove(i-1);
        System.out.println("ArrayList after removing the last element ");
        System.out.println(AList);


    }
}

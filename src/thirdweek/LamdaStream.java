package src.thirdweek;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

//Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters.
// Use Java 8 Lambdas and Streams API's.
public class LamdaStream {
    public static void main(String[] args) {
        /*String s1[] = {"hi", "hello", "and", "alps", "has", "name","are","ape"};
        Arrays.stream(s1).filter(s -> s.length() == 3).filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s.toString()));
       */
       List<String> s = new ArrayList<>();
        Collections.addAll(s,"hi","add","Are","hi","Ate","append");

        List<String> st=fin(s);
        st.forEach(x->System.out.println(x));

    }
    public static List<String> fin(List<String> list)
    {
        return list.stream().map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

}

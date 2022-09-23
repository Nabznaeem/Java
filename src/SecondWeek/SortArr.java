package src.SecondWeek;
import java.util.Arrays;
import java.util.Comparator;
//Create an Array of 8 Students, where each Student class has firstName, LastName and GPA as attributes. Sort the array based on GPA.
public class SortArr {
    public static void main(String[] args) {
        Students s[] = new Students[8];
        s[0] = new Students("Nab","Khan", 3.7f);
        s[1] = new Students("Sam", "Wane", 3.4f);
        s[2] = new Students("Lisa", "Susan", 3.0f);
        s[3] = new Students("Sarah", "Kal", 3.1f);
        s[4] = new Students("Kavya", "Kapoor", 2.9f);
        s[5] = new Students("Tom", "Henry", 3.9f);
        s[6] = new Students("Manish", "Tiwari", 2.8f);
        s[7] = new Students("Lal", "Singh", 2.6f);

      /*  Comparator c = new Comparator<Students>() {
            @Override
            public int compare(Students o1,Students o2) {
                // positive integer means o1 is greater than o2
                // negative integer means o1 isl ess than o2
                // zero means both are equal

                int result = 0;
                if (o1.getGPA().compareTo(o2.getGPA()) > 0)
                    result = 1;
                if (o1.getGPA().compareTo(o2.getGPA()) < 0)
                    result = -1;
                return result;
            }
        };
        Arrays.sort(s, c);
        /*new Comparator<s>() {
            public int compare(Students o1, Students o2) {
                return o1.getGPA().compareTo(o2.getGPA());
            }
        });*/

        for (Students p : s) {
            System.out.println(p.getFirstName() + "  " + p.getLastName() + " " + p.getGPA());

        }
    }

    /*@Override
    public int compare(Students o1, Students o2) {
        return 0;
    }*/
}

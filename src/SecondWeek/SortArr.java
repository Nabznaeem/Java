package src.SecondWeek;
import java.util.Arrays;
//Create an Array of 8 Students, where each Student class has firstName, LastName and GPA as attributes. Sort the array based on GPA.
public class SortArr {
    public static void main(String[] args) {
        Students s[] = new Students[8];
        s[0] = new Students("Name1","LName1", 3.7d);
        s[1] = new Students("Name2","LName2", 3.4d);
        s[2] = new Students("Name3","LName3", 3.0d);
        s[3] = new Students("Name4","LName4", 3.1d);
        s[4] = new Students("Name5","LName5", 2.9d);
        s[5] = new Students("Name6","LName6", 3.9d);
        s[6] = new Students("Name7","LName7", 2.8d);
        s[7] = new Students("Name8","LName8", 2.6d);

        System.out.println("Array before sort:");
        for (Students p : s) {
            System.out.println(p.getFirstName() + "  " + p.getLastName() + " " + p.getGPA());}
        Arrays.sort(s, (o1, o2) -> {
            Double d1 = o1.getGPA();
            Double d2 = o2.getGPA();
            return d1.compareTo(d2);
        });
            System.out.println("Array after sort:");
        for (Students p : s) {
            System.out.println(p.getFirstName() + "  " + p.getLastName() + " " + p.getGPA());

        }
    }
}

package src.SecondWeek;
//Given an ArrayList of Students, where each Student class has firstName, LastName and GPA as attributes. Sort the List based on lastName.
import java.util.ArrayList;

public class SortList {
    public static void main(String[] args) {

        ArrayList<Students> Stud = new ArrayList<>();

        Stud.add(new Students("Name1", "LName1", 3.18d));
        Stud.add(new Students("Name2", "LName2", 3.74d));
        Stud.add(new Students("Name3", "LName3", 3.21d));
        Stud.add(new Students("Name4", "LName4", 3.4d));
        Stud.add(new Students("Name5", "LName5", 3.5d));

        System.out.println("Before sort:");
        for (Students s : Stud) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getGPA());
        }

        Stud.sort((s1, s2) -> {

            Double gpa = s1.getGPA();
            Double gpa1 = s2.getGPA();

            return gpa.compareTo(gpa1);
        });


        System.out.println("After sort:");
        for (Students s : Stud) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getGPA());
        }
    }
}


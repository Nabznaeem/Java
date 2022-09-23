package src.SecondWeek;
import java.util.*;
public class Students implements Comparable<Students>{
    public String FirstName,LastName;
    public float GPA;

    public Students(String FirstName,String LastName,float GPA)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.GPA=GPA;
    }
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public float getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Students o) {
        return 0;
    }


        //return this.GPA.compareTo(s.GPA);

    }

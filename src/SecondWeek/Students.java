package src.SecondWeek;

import static java.lang.Double.compare;

public class Students implements Comparable<Students>{
    public String FirstName,LastName;
    public double GPA;

    public Students(String FirstName,String LastName,double GPA)
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

    public double getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Students o) {
        return compare(GPA, o.GPA);

    }


        //return this.GPA.compareTo(s.GPA);

    }

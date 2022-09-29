package src.thirdweek;

import src.SecondWeek.Students;

import java.util.HashMap;

//Given a Student Object with FirstName, LastName and GPA as attributes,
// Create a Hashmap of 8 students , with Key as Person Object and value as full name ( firstName + lastName). Print the HashMap.
public class HashObject {
    public static void main(String[] args) {
        Students s[] = new Students[8];
        s[0] = new Students("Name1", "LName1", 3.7d);
        s[1] = new Students("Name2", "LName2", 3.4d);
        s[2] = new Students("Name3", "LName3", 3.0d);
        s[3] = new Students("Name4", "LName4", 3.1d);
        s[4] = new Students("Name5", "LName5", 2.9d);
        s[5] = new Students("Name6", "LName6", 3.9d);
        s[6] = new Students("Name7", "LName7", 2.8d);
        s[7] = new Students("Name8", "LName8", 2.6d);

        HashMap<Students, String> person = new HashMap<>();
        for (Students students : s) {
            person.put(students, students.getFirstName() + students.getLastName());
        }

        for (Students key : person.keySet()) {
            System.out.println("Key " + key + " contains " + person.get(key));
        }
    }
}
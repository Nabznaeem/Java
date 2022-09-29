package src.thirdweek;

import src.SecondWeek.Students;

import java.util.HashMap;


/*Given a Student Object with FirstName, LastName and GPA as attributes.
 Create a Hashmap of 8 students , with Key as the first name and value as Person object. Print the HashMap.
*/
public class HashMapStud {
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

        HashMap<String,Students> person = new HashMap<>();
        for (Students students : s) {
            person.put(students.getFirstName(), students);
        }

        for(String key: person.keySet()){
            System.out.println("Key "+key+" contains "+person.get(key));
        }
    }
}

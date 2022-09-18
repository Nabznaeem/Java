/*Create a class "Student.java" with a variable "Name". Write two functions:

getName() that returns "Name" from state.
setName() that takes an argument and updates the state variable "Name".*/
package src;
public class Student {

        private String Name; // 0

        public String getName(){
            return  this.Name;
        }

        public void setName(String Name){
            this.Name = Name;
        }

    }
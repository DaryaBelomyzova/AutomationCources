package students;

import java.util.concurrent.ThreadLocalRandom;

public class Student {

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName;
    public String lastName;

    int takeExam(){
        return ThreadLocalRandom.current().nextInt(1, 5);
    }

}

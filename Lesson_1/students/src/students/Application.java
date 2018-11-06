package students;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static double countExamAverage(List<Integer> results){
        double commonSum = 0;
        for (int result : results){
            commonSum += result;
        }
        return commonSum / results.size();
    }

    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Thome", "Yorke"));
        students.add(new Student("IAN", "Curtis"));
        students.add(new Student("Polly", "Harvey"));
        students.add(new Student("Jim", "Halpert"));
        students.add(new Student("Michael", "Boss"));

        List<Integer> results = new ArrayList<Integer>();

        for (Student student : students){
            var res = student.takeExam();
            results.add(res);

            System.out.println(res);
        }

        System.out.println(countExamAverage(results));
    }
}

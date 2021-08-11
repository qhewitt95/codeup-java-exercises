package grades;

import java.util.ArrayList;

public class Student {


    private String name;
    private int studentGrade;

    public Student(String name) {
        this.name = name;
    }

    ArrayList<Integer> grade = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Integer> grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {

        Student student = new Student("bob");
        System.out.println(student.getName());



    }
}

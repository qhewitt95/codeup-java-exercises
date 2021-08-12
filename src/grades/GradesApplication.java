package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student docrob = new Student("Mark");
        docrob.addGrade(78);
        docrob.addGrade(88);
        docrob.addGrade(98);

        Student dorian = new Student("Dorian");
        dorian.addGrade(96);
        dorian.addGrade(89);
        dorian.addGrade(100);

        Student casey = new Student("Casey");
        casey.addGrade(85);
        casey.addGrade(70);
        casey.addGrade(93);

        Student ry = new Student("Ry");
        ry.addGrade(86);
        ry.addGrade(99);
        ry.addGrade(91);

        students.put("madmarcos", docrob);
        students.putIfAbsent("doriandub", dorian);
        students.putIfAbsent("vegetasrevenge", casey);
        students.putIfAbsent("jreich5", ry);

        commandLineInterface(students);
    }

    public static void commandLineInterface(HashMap<String,Student> students){
        Input input = new Input();
            do {
                System.out.println("Welcome!\n" +
                        "\n" +
                        "Here are the GitHub usernames of our students:");

                for (String key : students.keySet()) {
                    System.out.print("|" + key + "|");
                }

                System.out.println("What student would you like to see more information on?\n");

                String userKey = input.getString();

                if (students.containsKey(userKey)) {
                    Student currentStudent = students.get(userKey);

                    System.out.println("Name: " + currentStudent.getName() + "Github Username: " + userKey);
                    System.out.println("Current Average: " + currentStudent.getGradeAverage());
                } else {
                    System.out.println("Sorry, there's no student with that Github username: " + userKey);
                }

                System.out.println("Would you like to see another student?");
            } while (input.yesNo());
    }










}

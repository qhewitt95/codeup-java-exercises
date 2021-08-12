package grades;

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

    }












}

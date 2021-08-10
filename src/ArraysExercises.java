import javax.xml.namespace.QName;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] arr;

        arr = new Person[4];
        arr[0] = new Person("Ken");
        arr[1] = new Person("Bob");
        arr[2] = new Person("Bobby");

        for (Person person : arr) {
            System.out.println("Hello my name is " + person);
        }

    }
}

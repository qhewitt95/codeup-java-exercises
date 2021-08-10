import Person.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] arr = new Person[3];

        arr = new Person[4];
        arr[0] = new Person("Ken");
        arr[1] = new Person("Bob");
        arr[2] = new Person("Bobby");

       // people[0] = new Person("Ry");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }

 //   people = addPerson(people, new Person("Mark")
    // System.out.print;n("With added Person);

    /*public static Person[] addPerson(Person[] people, personToAdd) {
        Person[] newPeopleArray = Arrays.copyOf(people,people.length + 1 )

                newPeopleArray[newPeopleArray.length -1] = personToAdd;

        return newPeopleArray;
    }*/
}

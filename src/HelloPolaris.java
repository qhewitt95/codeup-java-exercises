import java.util.Scanner;
public class HelloPolaris {

    public static void main(String[] args) {
//        System.out.println("Hello, world");
//
//        int myFavoriteNumber = 27;
//        System.out.print(myFavoriteNumber);
//
//        String myString = "3.14159";
//        System.out.print(myString);

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }

}

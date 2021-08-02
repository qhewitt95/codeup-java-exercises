import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){
//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately "+ pi);

        Scanner scanner = new Scanner(System.in);
    //Question 1
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

    //Question 2
//        System.out.print("Enter three words: ");
//        String userInput = scanner.next();
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

    //Question 3,4
        //next() only gets one word
//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


        System.out.println("Enter length and width of Codeup classroom: ");
        System.out.println("Give us a width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Give us a length: ");
        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        System.out.println("Area "+ area);

        double perimeter =( width *2) + (length *2);
        System.out.println("Perimeter is: " + perimeter);
    }

}


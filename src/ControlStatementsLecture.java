
import java.util.Scanner;
public class ControlStatementsLecture {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        //Ask user for favorite color
        System.out.print("Whats your favorite color");
        String userFavoriteColor = scanner.nextLine();

        switch (userFavoriteColor) {
            case "blue":
                System.out.println("Hey thats mine too");
                break;
            case "red":
                System.out.println("Thats cool too");
                break;
            default:
                System.out.println("That ones ok too");
                break;
        }

        boolean userAcceptedTerms = false;
        String userResponse = scanner.nextLine();

        while(!userAcceptedTerms){
            System.out.println("Do you agree to our terms and service");
            userAcceptedTerms = scanner.nextLine().toLowerCase().contains("y");
        }
            System.out.print("Thank you for accepting our terms and services.");

            boolean usersKnowsName = false;
        do {
            System.out.println("Type in your name!");
            usersKnowsName = scanner.nextLine().equals("samuel");
        }while (!usersKnowsName);

        for (int i = 0; i <= 100; i++) {
            System.out.println("We are at number  " + i);
        }
//        for (int i = 0; i < 100; i++) {
//            if(i == 45) {
//                System.out.println("Skipping number 45 ");
//                continue;
//            }
//
//            System.out.println(i);
        for (int i = 0; i < 100; i++) {
            if(i == 45) {
                System.out.println("Skipping number 45 ");
                break;
            }

            System.out.println(i);
        }

    }

}

import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean goAgain = true;

        do {
            System.out.println("Talk to Bob");
        String userInput = scanner.nextLine();

        if(userInput.endsWith("?")) {
            System.out.println("Bob:Sure");
        }else if (userInput.endsWith("!")){
            System.out.println("Bob: Woah, chill out");
        }else if (userInput.equals("")){
            System.out.println("Bob: Fine. Be that way!");
        }else if (userInput.endsWith("")){
            System.out.println("Bob:Whatever");
        }
        System.out.println("Do you want to keep talking to Bob (y/n) ");
        String userResponse = scanner.nextLine();

        if(!userResponse.equalsIgnoreCase("y")){
            goAgain = false;
        }
    }while(goAgain);


    }
}

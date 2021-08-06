package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner ;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Type Something: ");
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo() {
        System.out.println("Select (y/n): ");
        String userAnswer = scanner.nextLine();
        return userAnswer.equals("y");
    }

    public double getInt(double min, double max) {
        System.out.println("give me an ineger: ");
        int userDouble = scanner.nextInt();

        if(userDouble < min || userDouble > max ){
            System.out.println("Try again ");
            return getInt(min, max);
        }else {
            System.out.println("Thats a valid integer ");
            return userDouble;
        }
    }

    public int getDouble() {
        System.out.println("Give me an integer: ");
        int userDouble = scanner.nextInt();
        return userDouble;
    }

}

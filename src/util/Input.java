//package util;
//
//import java.util.Scanner;
//
//public class Input {
//
//    private Scanner scanner ;
//
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
//
//    public String getString(){
//        System.out.println("Type Something: ");
//        String userString = scanner.nextLine();
//        return userString;
//    }
//
//    public boolean yesNo() {
//        System.out.println("Select (y/n): ");
//        String userAnswer = scanner.nextLine();
//        return userAnswer.equals("y");
//    }
//
//    public int getInt(int min, int max) {
//        System.out.println("give me an integer: ");
//        int userInt = scanner.nextInt();
//
//        try {
//            userInt =  Integer.valueOf(this.getString());
//        } catch (NumberFormatException e) {
//            System.out.println("That is not an integer!");
//            return getInt(min, max);
//        }
//
//        if(userInt < min || userInt > max ){
//            System.out.println("Try again ");
//            return getInt(min, max);
//        }else {
//            System.out.println("Thats a valid integer ");
//            return userInt;
//        }
//    }
//
//    public int getDouble() {
//        System.out.println("Give me an integer: ");
//        int userDouble = scanner.nextInt();
//        return userDouble;
//    }
//
//    public int getBinary(){
//        System.out.println("Enter binary number");
//        try {
//            return Integer.valueOf(this.getString(), 2);
//        } catch (NumberFormatException e) {
//            System.out.println("That is not a binary number");
//        }
//    }

//}

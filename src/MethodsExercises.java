import java.util.Scanner;
public class MethodsExercises {

    public static double Addition(double numOne, double numTwo){
        return numOne + numTwo;
    }
    public static double Subtraction(double numOne, double numTwo){
        return numOne - numTwo;
    }
    public static double Multiplication(double numOne, double numTwo){
       // return numOne * numTwo;

        double totalAdded = 0;
        for (int i = 0; i < numTwo; i++) {
            totalAdded += numOne;
        }
        return totalAdded;
    }
    public static double Division(double numOne, double numTwo){
        return numOne / numTwo;
    }
    public static double Modulus(double numOne, double numTwo){
        if (numTwo == 0) {
            return numOne;
        }
        return numOne % numTwo;
    }



    public static int getIntegerRecursion(int min, int max){
        int userResponse = min - 1;
        boolean hasLoopRanOnce = false;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Enter a number between "+ min +" and "+ max +":");
            userResponse = scanner.nextInt();

            if(hasLoopRanOnce){
                System.out.println(userResponse +" is not within the range ");
            }

        }while(!(userResponse >= min && userResponse <= max));
            return userResponse;
//            if(userResponse >= min && userResponse <= max) {
//                return userResponse;
//            }else {
//                System.out.println(userResponse +" is not within the range ");
//                return getInteger(min, max);
//            }

    }
    public static String getFactorialString(int num) {
        String stringToReturn = "";
        for (int i = 1; i < num; i++) {
         stringToReturn += i + " x ";
            if(i == num) {
                stringToReturn += i;
            }
        }
        return stringToReturn;
    }

    public static int getFactorialSum(int num){
        int sum = 0;
        for (int i = 2; i <= num ; i++) {

            sum *= i;

        }

        return sum;
    }

    public static void getFactorial(){
        int factorialNumber = getIntegerRecursion(1,10);

        for (int i = 1; i < factorialNumber ; i++) {
            System.out.println(i + "! = " + getFactorialString(i) + " = " + i);
        }
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void diceRoll(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Give me the number of sides your dice has. ");
        int numberOfSides = getIntegerRecursion(2, 20);

        int firstRoll = getRandomNumber(1, numberOfSides);
        int secondRoll = getRandomNumber(1, numberOfSides);

        System.out.printf("first Die ==> %d\nsecond Die ==> %d\n ", firstRoll, secondRoll );

        System.out.println("Would you like to continue?");
       String userResponse = userInput.nextLine();
       boolean doesUserWantToContinue = userResponse.toLowerCase().contains("y");
        if(doesUserWantToContinue) {
            diceRoll();
        }

    }


    public static void main(String[] args) {

        System.out.println(Addition(5,2));
        System.out.println(Subtraction(10,5));
        System.out.println(Multiplication(4,6));
        System.out.println(Division(20,5));
        System.out.println(Modulus(150,10));

       // System.out.println("Your number in the range was " + getIntegerRecursion(1,100));

        diceRoll();
    }

}

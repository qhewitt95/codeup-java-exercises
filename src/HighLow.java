//import java.util.Scanner;
//public class HighLow {
//
//   static int randomNumber = MethodsExercise.getRandomNumber(1, 100);
//
//   public static int getUsersToGuessedNumber() {
//       System.out.println("Guess the number. ");
//      int usersGuessedNum = MethodsExercise.getIntegerRecursion(1, 100);
//      return usersGuessedNum;
//   }
//   public static int highLowGame(){
//       int usersGuessedNum = MethodsExercise.getIntegerRecursion(1, 100);
//       System.out.println(randomNumber);
//       int usersLastGuess = getUsersToGuessedNumber();
//
//
//
//       do{
//           usersLastGuess = getUsersToGuessedNumber();
//           if (usersLastGuess > randomNumber) {
//               System.out.println("You need to go LOWER");
//           }else if (usersLastGuess < randomNumber) {
//               System.out.println("You need to go HIGHER");
//           }
//       }while(usersLastGuess != randomNumber);
//
//       System.out.println("You guessed correct!!");
//   }
//
//    public static void main (String[] args) {
//
//        highLowGame();
//    }
//}

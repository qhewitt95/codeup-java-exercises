public class MethodsExercise {

    public static double Addition(double numOne, double numTwo){
        return numOne + numTwo;
    }
    public static double Subtraction(double numOne, double numTwo){
        return numOne - numTwo;
    }
    public static double Multiplication(double numOne, double numTwo){
        return numOne * numTwo;
    }
    public static double Division(double numOne, double numTwo){
        return numOne / numTwo;
    }

    public static void main(String[] args) {

        System.out.println(Addition(5,2));
        System.out.println(Subtraction(10,5));
        System.out.println(Multiplication(4,6));
        System.out.println(Division(20,5));
    }

}

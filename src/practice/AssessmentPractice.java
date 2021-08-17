package practice;

public class AssessmentPractice {

    public static double multiply(int a, int b){
        return (a*b);
    }
    public static double multiply(double a, double b){
        return (a*b);
    }

    public static void getMallardDetails(Mallard mallard){
        System.out.println(mallard.getName() + " has a flight speed of " + mallard.getFlightspeed());
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 3));
        System.out.println(multiply(3.0, 3.0));

        Mallard mallard = new Mallard("howard", 20, 5);
        getMallardDetails(mallard);

    }



}

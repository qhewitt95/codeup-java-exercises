package shapes;

public class Square extends Rectangle {

    public static double  squarePerimeter(double side) {
        double perimeter = 4 * side;
        return perimeter;
    }
    public static double squareArea(int side) {
        double area = side^2;
        return area;
    }

    public static void main(String[] args) {

        System.out.println(squareArea(5));

    }

}

package shapes;

public class Rectangle {

    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static double getPerimeter(double length, double width) {
        double perimeter = 2*length + 2*width;
        return perimeter;
    }
    public static void main(String[] args) {

        System.out.println(getArea(5,10));
        System.out.println(getPerimeter(5, 10));

    }
}

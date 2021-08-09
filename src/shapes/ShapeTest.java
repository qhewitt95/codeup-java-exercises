package shapes;

public class ShapeTest {


    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Perimeter: " + box1.getPerimeterRec());
        System.out.println("Area: " + box1.getAreaRec());


        Rectangle box2 = new Square(5);
        System.out.println("Perimeter: " + box2.getPerimeterRec());
        System.out.println("Area: " + box2.getAreaRec());


    }
}

package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}









/*    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getAreaRec(){
        return length*width;
    }
    public double  getPerimeterRec(){
        return (length * 2) + (width * 2);
    }
    public static void main(String[] args) {
    }
}*/

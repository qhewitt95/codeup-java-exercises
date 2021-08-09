package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {

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

/*
    public double side;
    public Square(double side) {
        super(side, side);
    }
    public double getPerimeter(){
        return super.getLength() + super.getWidth();
    }
    public double getArea(){
        return super.getLength() * super.getWidth();
    }
    public static void main(String[] args) {
    }
}*/

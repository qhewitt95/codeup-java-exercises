package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {

    }

    @Override
    public double getPerimeter() {
        return this.length* 4;
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    @Override
    public void setLength(double length) {
        this.length=length;
    }

    @Override
    public void setWidth(double width) {
        this.width=length;
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

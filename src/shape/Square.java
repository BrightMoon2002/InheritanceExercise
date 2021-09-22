package shape;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side) ;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setSide(length);
    }

    public double getArea() {
        return getSide()*getSide();
    }

    public double getPerimeter() {
        return (getSide()+getSide())/2;
    }

    @Override
    public String toString() {
        return "Square with side= " + getSide() + "Which is subclass of" + super.toString();
    }
}

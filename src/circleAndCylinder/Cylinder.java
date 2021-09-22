package circleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return super.getArea()* 2+ super.getArea()*getHeight();
    }

    public double getVolume() {
        return super.getPerimeter() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with" +
                "height=" + getHeight() +
                "Which is subclass of  " + super.toString();
    }
}

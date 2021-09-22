package circleAndCylinder;

public class Circle {
    private String color = "Red";
    private double radius = 1.0;


    public Circle() {
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with" +
                "radius=" + radius +
                ", color='" + color + '\'';
    }
}

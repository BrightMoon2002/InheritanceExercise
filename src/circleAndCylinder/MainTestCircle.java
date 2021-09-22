package circleAndCylinder;

public class MainTestCircle {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test use Circle");

        Circle circle = new Circle();
        System.out.println(circle);

        circle.setColor("Orange");
        circle.setRadius(12);
        System.out.println(circle);

        Circle circle1 = new Circle("Yellow", 20);
        System.out.println(circle1);

        System.out.println(circle.getArea());
        System.out.println(circle1.getPerimeter());
    }
}

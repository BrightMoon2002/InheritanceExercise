package shape;

public class MainTestCircle {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");

        Circle circle = new Circle();
        System.out.println(circle);

        circle.setRadius(3.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        circle.setColor("Yellow");
        circle.setFilled(false);
        System.out.println(circle);

    }
}

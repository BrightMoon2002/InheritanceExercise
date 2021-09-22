package shape;

public class MainTestRectangle {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle.setLength(4.0);
        rectangle.setWidth(2.0);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        rectangle.setColor("Blue");
        rectangle.setFilled(false);
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle("Orange", true, 5.0, 6.2);
        System.out.println(rectangle1);
    }
}

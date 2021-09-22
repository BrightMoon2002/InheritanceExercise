package point2;

public class MainTestPoint {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test the Point");

        System.out.println("Creat a Point x = 2, y = 3");
        Point point = new Point(2, 3);
        System.out.println(point);

        System.out.println("Test set x ,y");
        point.setX(3);
        point.setY(4);
        System.out.println(point);
    }
}

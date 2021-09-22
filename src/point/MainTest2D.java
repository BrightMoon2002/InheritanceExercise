package point;

public class MainTest2D {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test the Point2D");


        System.out.println("Creat a Point2D with x = 1, y=2");
        Point2D point2D = new Point2D(1, 2);
        System.out.println(point2D);

        System.out.println("Change x = 3 and y = 4 by method set");
        point2D.setX(3);
        point2D.setY(4);
        System.out.println(point2D);
    }
}

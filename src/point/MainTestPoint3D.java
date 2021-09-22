package point;

public class MainTestPoint3D {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test the Point3D");

        System.out.println("Creat a Point3D with z = 3");
        Point3D point3D = new Point3D(3);
        System.out.println(point3D);

        System.out.println("Creat a Point3D with x = 2, y = 1, z = 4");
        Point3D point3D1 = new Point3D(2,1,4);
        System.out.println(point3D1);


        System.out.println("set x, y, z");
        point3D1.setX(1);
        point3D1.setY(2);
        point3D1.setZ(3);
        System.out.println(point3D1);
        point3D1.setXYZ(3, 4, 6);
        System.out.println("test setXYZ");
        System.out.println(point3D1);
    }
}

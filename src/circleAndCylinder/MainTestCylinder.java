package circleAndCylinder;

public class MainTestCylinder {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test the Cylinder");

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder.setHeight(3);
        cylinder.setColor("Brown");
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder("Brown", 22, 12);
        System.out.println(cylinder1);
        System.out.println(cylinder1.getVolume());
        System.out.println(cylinder1.getArea());

        Cylinder cylinder2 = new Cylinder(12);
        System.out.println(cylinder2);
    }
}

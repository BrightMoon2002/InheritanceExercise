package shape;

public class MainTestSquare {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");

        Square square = new Square(3);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println(square);

        square.setColor("blue");
        square.setFilled(false);
        System.out.println(square);
    }
}

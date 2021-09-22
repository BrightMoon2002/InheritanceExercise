package shape;

import java.util.Scanner;

public class MainTestShape {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        Scanner scanner = new Scanner(System.in);

        Shape shape = new Shape();
        System.out.println(shape);

        shape.setColor("red");
        System.out.println(shape);

        shape.setFilled(false);
        System.out.println(shape);

        System.out.println("Enter the color of the shape:");
        String color = scanner.nextLine();
        shape.setColor(color);
        System.out.println(shape);
    }
}

package point2;

public class MainTestMoveAblePoint {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Test the Point move:");

        System.out.println("creat a Point with speed:");
        MoveAblePoint moveAblePoint = new MoveAblePoint(2,3);
        System.out.println(moveAblePoint);
        System.out.println("Change x, y of Point:");
        moveAblePoint.setX(2);
        moveAblePoint.setY(5);
        System.out.println(moveAblePoint);
        System.out.println("Make the Point move with xSpeed and ySpeed:");
        System.out.println(moveAblePoint.move());
    }
}

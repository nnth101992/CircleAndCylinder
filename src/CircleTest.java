public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        circle = new Circle(5, "blue");
        System.out.println(circle);
    }
}

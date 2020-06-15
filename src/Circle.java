public class Circle {
    private int radius = 2;
    private String color = "green";

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with color of " + getColor() + " and radius=" + getRadius();
    }
}

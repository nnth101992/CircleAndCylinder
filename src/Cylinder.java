public class Cylinder extends Circle {
    private int height = 5;

    public Cylinder() {
    }

    public Cylinder(int radius, int height, String color) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height of " + getHeight() + " and volume=" + getVolume() + ", which is a subclass of " + super.toString();
    }
}

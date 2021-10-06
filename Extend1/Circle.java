public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected static final double PI = Math.PI;

    /**
     * Constructor.
     */
    public Circle() {

    }

    /**
     * Constructor.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * get radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get color.
     */
    public String getColor() {
        return color;
    }

    /**
     * set color.
     */
    public  void setColor(String color) {
        this.color = color;
    }

    /**
     * get area.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * toString.
     */
    public String toString() {
        String res = "";
        res += "Circle[radius=";
        res += String.valueOf(radius);
        res += ",color=";
        res += color;
        res += ']';
        return res;
    }
}

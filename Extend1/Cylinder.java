public class Cylinder extends Circle{
    private double height = 1.0;

    /**
     * Constructor.
     */
    public Cylinder() {

    }

    /**
     * constructor.
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * constructor.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * constructor.
     */
    Cylinder(double radius, double height, String color) {
        super(radius,color);
        this.height = height;
    }

    /**
     * setter.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * getter.
     */
    public double getHeight() {
        return height;
    }

    /**
     * get volume.
     */
    public double getVolume() {
        return height * super.getArea();
    }

    /**
     * area of cylinder.
     */
    @Override
    public double getArea() {
        return super.getArea() * 2;
    }

    /**
     * to string.
     */
    @Override
    public String toString() {
        String res = "";
        res += "Cylinder[Circle";
        res += super.toString();
        res += "],height=";
        res += String.valueOf(height);
        res += "]";
        return res;
    }
}

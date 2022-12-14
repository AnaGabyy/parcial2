public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double areaRectangle = getLength() * getWidth();
        return areaRectangle;
    }

    public double getPerimeter(){
        double perimeterRectangle = 2 * getLength() + 2 * getWidth();
        return perimeterRectangle;
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangle[" +
                "Width=" + width +
                ", Length=" + length +
                ']';
    }
}

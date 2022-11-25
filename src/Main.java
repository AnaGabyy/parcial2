public class Main {
    public static void main(String[] args) {

        Circle s1 = new Circle("red", false, 5.0);

        Square s2 = new Square(); //cargar usando setters
        s2.setColor("Yellow");
        s2.setSide(8.2);

        Rectangle s3 = new Rectangle("red", false, 1.0, 2.0);

        Square s4 = new Square(6.6);


        System.out.println("Parcial 2 de POO");
        System.out.println("------------");


        System.out.println("Circle data (s1): \nColor: " + s1.getColor() + "\nIt is filled: " + s1.isFilled() +
                "\nRadius: " + s1.getRadius() + "\nArea: " + s1.getArea() + "\nPerimeter: " + s1.getPerimeter());
        System.out.println("------------");


        System.out.println("Square data (s2): \nColor: " + s2.getColor() + "\nIt is filled: " + s2.isFilled() +
                "\nMeasure of the sides: " + s2.getSide());
        System.out.println("------------");


        System.out.println("Rectangle data (s3): \nColor: " + s3.getColor() + "\nIt is filled: " + s3.isFilled() +
                "\nWidth: " + s3.getWidth() + "\nLength: " + s3.getLength() + "\nArea: " + s3.getArea() + "\nPerimeter: " + s3.getPerimeter());
        System.out.println("------------");


        System.out.println("Square data (s4): \n" + s4.toString());

    }
}

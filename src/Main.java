public class Main {
    public static void main(String[] args) {
        System.out.println("Está funcionando");

        Shape s1 = new Circle("red", false, 5.0);

        Square s2 = new Square(); //cargar usando setters
        s2.setColor("Rosado");
        s2.setFilled(false);

        Shape s3 = new Rectangle("red", false, 1.0, 2.0);

        Shape s4 = new Square(6.6);



    }
}

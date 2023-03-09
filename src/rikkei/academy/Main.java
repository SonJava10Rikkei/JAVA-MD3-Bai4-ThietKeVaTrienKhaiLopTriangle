package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.calPerimeter();
        System.out.println(triangle); // Triangle with sides 3.0, 4.0, 5.0
        System.out.println("Perimeter: " + triangle.getPerimeter()); // Perimeter: 12.0
        Shape shape = new Shape(3, 4, 5);
        shape.calPerimeter();
        shape.calArea();
    }
}

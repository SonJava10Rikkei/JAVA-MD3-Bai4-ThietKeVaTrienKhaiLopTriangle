package rikkei.academy;

public class Shape extends Triangle {
    private double area;

    public Shape() {

    }

    public Shape(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calArea() {
        double p = getPerimeter() / 2;
        this.area = Math.sqrt(p * (p - getSide1()) * (p - getSide2())) * (p - getSide3());
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }
}

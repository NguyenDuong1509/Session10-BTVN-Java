package Ss10Rikke;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius*radius;
    }

    public static void main(String[] args) {
        Shape s1 = new Rectangle(2,3);
        Shape s2 = new Circle(1);

        System.out.println("Diện tích hình chữ nhật là:"+s1.area());
        System.out.println("Diện tích hình tròn là:"+s2.area());

    }
}

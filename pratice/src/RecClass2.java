import java.util.Scanner;

public class RecClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = 3.5;
        double height = 35.9;
        Rectangles rectangle = new Rectangles(width, height);
        System.out.println("Width of Rectangle is " + width + "; Height of Rectangle is " + height);
        System.out.println("Area of the Rectangle " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
    }
}

class Rectangles {
    double width, height;

    public Rectangles() {

    }

    public Rectangles(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
}
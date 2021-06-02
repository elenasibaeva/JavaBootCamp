package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Shape p1 = new Square(5);
        Shape p2 = new Rectangle(5, 6);

        p1.setColor("Red");
        System.out.println("*** Print the Information for Square");
        System.out.println("Color of square:" + p1.getColor());
        System.out.println("Area of square:" + p1.calculateArea());
        System.out.println("Perimeter of square:" + p1.calculatePerimeter());

        p2.setColor("Pink");
        System.out.println("*** Print the Information for Rectangle");
        System.out.println("Color of square:" + p2.getColor());
        System.out.println("Area of square:" + p2.calculateArea());
        System.out.println("Perimeter of square:" + p2.calculatePerimeter());

    }
}
package Homework6_2;

public class Main {
    public static void main(String[] args) {
        Calculate[] shapes = new Calculate[3];
        shapes[0] = new Triangle(3, 6, 3);
        shapes[1] = new Square(2, 5);
        shapes[2] = new Circle(3);

        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            Calculate shape = shapes[i];
            totalPerimeter += shape.perimeter();
        }
        System.out.println("Сумма периметров фигур: " + totalPerimeter);

        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            Calculate shape = shapes[i];
            totalArea += shape.area();
        }
        System.out.println("Сумма площадей фигур: " + totalArea);
    }
}

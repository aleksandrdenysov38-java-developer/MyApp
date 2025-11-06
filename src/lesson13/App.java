package lesson13;

public class App {
    public static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.getArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 3),
                new Square(6)
        };

        double total = totalArea(shapes);
        System.out.println("Суммарная площадь всех фигур: " + total);
    }
}

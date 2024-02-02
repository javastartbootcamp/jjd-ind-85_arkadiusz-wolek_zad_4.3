package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(4.0);
        System.out.println("Pole kwadratu o boku " + square.getSideLength() + " to " + shapeCalculator.calculateSquareArea(square));
        Rectangle rectangle = new Rectangle(5.0, 2.0);
        System.out.println("Obwód prostokąta o bokach " + rectangle.getSideALength() + " i " + rectangle.getSideBLength() + " wynosi " + shapeCalculator.calculateRectPerimeter(rectangle));
        Circle circle = new Circle(10.0);
        System.out.println("Pole koła o promieniu " + circle.getRadiusLength() + " wynosi " + shapeCalculator.calculateCircleArea(circle));
        Triangle triangle = new Triangle(4.0, 6.0, 7.0);
        System.out.println("Obwód trójkąta o bokach " + triangle.getSideALength() + ", " + triangle.getSideBLength() + " i " + triangle.getSideCLength() + " wynosi " + shapeCalculator.calculateTrianglePerimeter(triangle));
    }
}

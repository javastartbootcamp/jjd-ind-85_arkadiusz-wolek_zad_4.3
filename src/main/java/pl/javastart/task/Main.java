package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(4.0);
        double squareArea = square.calculateArea();
        System.out.println("Pole kwadratu o boku " + square.getSideLength() + " to " + squareArea);
        Rectangle rectangle = new Rectangle(5.0, 2.0);
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Obwód prostokąta o bokach " + rectangle.getSideALength() + " i " + rectangle.getSideBLength() + " wynosi " + rectanglePerimeter);
        Circle circle = new Circle(10.0);
        double circleArea = circle.calculateArea();
        System.out.println("Pole koła o promieniu " + circle.getRadiusLength() + " wynosi " + circleArea);
        Triangle triangle = new Triangle(4.0, 6.0, 7.0);
        double trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("Obwód trójkąta o bokach " + triangle.getSideALength() + ", " + triangle.getSideBLength() + " i " + triangle.getSideCLength() + " wynosi " + trianglePerimeter);
    }
}

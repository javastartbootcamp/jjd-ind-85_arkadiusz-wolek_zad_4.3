package pl.javastart.task;

public class ShapeCalculator {
    public double calculateSquareArea(Square square) {
        return (square.getSideLength() * square.getSideLength());
    }

    public double calculateCircleArea(Circle circle) {
        return (Math.PI * circle.getRadiusLength() * circle.getRadiusLength());
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return (triangle.getSideALength() + triangle.getSideBLength() + triangle.getSideCLength());
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return (2 * (rectangle.getSideALength() + rectangle.getSideBLength()));
    }
}

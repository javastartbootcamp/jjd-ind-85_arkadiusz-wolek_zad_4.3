package pl.javastart.task;

public class Circle {
    private double radiusLength;

    public Circle(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public double getRadiusLength() {
        return radiusLength;
    }

    public double calculateArea() {
        return (Math.PI * radiusLength * radiusLength);
    }
}

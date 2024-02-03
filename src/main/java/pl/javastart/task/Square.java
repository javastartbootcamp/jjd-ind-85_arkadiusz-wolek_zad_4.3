package pl.javastart.task;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double calculateArea() {
        return (a * a);
    }
}

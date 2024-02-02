package pl.javastart.task;

public class Triangle {
    private double sideALength;
    private double sideBLength;
    private double sideCLength;

    public Triangle(double sideALength, double sideBLength, double sideCLength) {
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
        this.sideCLength = sideCLength;
    }

    public double getSideALength() {
        return sideALength;
    }

    public double getSideBLength() {
        return sideBLength;
    }

    public double getSideCLength() {
        return sideCLength;
    }

    public double calculatePerimeter() {
        return (sideALength + sideBLength + sideCLength);
    }
}

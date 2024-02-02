package pl.javastart.task;

public class Rectangle {
    private double sideALength;
    private double sideBLength;

    public Rectangle(double sideALength, double sideBLength) {
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
    }

    public double getSideALength() {
        return sideALength;
    }

    public double getSideBLength() {
        return sideBLength;
    }

}

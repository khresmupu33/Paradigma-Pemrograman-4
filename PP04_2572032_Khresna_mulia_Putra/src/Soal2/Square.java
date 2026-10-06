package Soal2;

public class Square extends TwoDimensionalShape {
    private double lengthOfSide;

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double getArea() {
        return lengthOfSide * lengthOfSide;
    }

    @Override
    public double getCircumference() {
        return 4 * lengthOfSide;
    }

    @Override
    public void showDetail() {
        System.out.printf("Area of Square is: %.2f%n", getArea());
        System.out.printf("Circumference of Square is: %.2f%n", getCircumference());
    }

    @Override
    public String toString() {
        return "Square";
    }
}


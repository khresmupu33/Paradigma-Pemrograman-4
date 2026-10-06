package Soal2;

public class Rectangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getCircumference() {
        return 2 * (base + height);
    }

    @Override
    public void showDetail() {
        System.out.printf("Area of Rectangle is: %.2f%n", getArea());
        System.out.printf("Circumference of Rectangle is: %.2f%n", getCircumference());
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}


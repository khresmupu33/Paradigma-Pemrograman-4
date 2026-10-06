package Soal2;

public class Cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public void showDetail() {
        System.out.printf("Volume of Cylinder is: %.2f%n", getVolume());
        System.out.printf("Surface area of Cylinder is: %.2f%n", getSurfaceArea());
    }

    @Override
    public String toString() {
        return "Cylinder";
    }
}


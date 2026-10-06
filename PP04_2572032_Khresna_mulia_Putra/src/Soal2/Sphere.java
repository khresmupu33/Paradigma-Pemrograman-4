package Soal2;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void showDetail() {
        System.out.printf("Volume of Sphere is: %.2f%n", getVolume());
        System.out.printf("Surface area of Sphere is: %.2f%n", getSurfaceArea());
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}

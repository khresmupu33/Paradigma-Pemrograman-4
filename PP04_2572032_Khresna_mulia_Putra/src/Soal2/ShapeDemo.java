package Soal2;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();

        while (true) {
            System.out.println("==================================================");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Sphere");
            System.out.println("4. Cylinder");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Length of side: ");
                double side = scanner.nextDouble();
                if (side <= 0) {
                    System.out.println("Length of side must have a value > 0");
                } else {
                    square.setLengthOfSide(side);
                    square.showDetail();
                }
            } else if (choice == 2) {
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                if (width <= 0 || height <= 0) {
                    System.out.println("Width and height must have a value > 0");
                } else {
                    rectangle.setBase(width);
                    rectangle.setHeight(height);
                    rectangle.showDetail();
                }
            } else if (choice == 3) {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                if (radius <= 0) {
                    System.out.println("Radius must have a value > 0");
                } else {
                    sphere.setRadius(radius);
                    sphere.showDetail();
                }
            } else if (choice == 4) {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                if (radius <= 0 || height <= 0) {
                    System.out.println("Radius and height must have a value > 0");
                } else {
                    cylinder.setRadius(radius);
                    cylinder.setHeight(height);
                    cylinder.showDetail();
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Wrong menu");
            }
        }
        scanner.close();
    }
}


import java.util.Scanner;

public class Cycle {
    static double pi = 3.14;
    static class Circle {
        public double radius = 1.0;
        public String color = "red";
        public Circle() {
            this.radius = 1.0;
            this.color = "red";
        }
        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double getArea() {
            return pi * radius * radius;
        }

        @Override
        public String toString() {
            return "Circle[radius=" + radius + ", color=" + color + "]";
        }
    }
    static class Cylinder extends Circle {
        private double height = 1.0;
        public Cylinder() {
            this.height = 1.0;
        }
        public Cylinder(double height) {
            this.height = height;
        }
        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }
        public Cylinder(double radius, double height, String color) {
            this.radius = radius;
            this.height = height;
            this.color = color;
        }
        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public double getVolume() {
            return super.getArea() * height;
        }

        @Override
        public String toString() {
            return "Cylinder: radius=" + String.format("%.1f", getRadius()) + ", height=" + String.format("%.1f", height) + ", " + getColor().toUpperCase() + ", volume=" + String.format("%.1f", getVolume());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            Cylinder myCylinder = null;
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    myCylinder = new Cylinder();
                    System.out.println(myCylinder);
                    break;
                case 1:
                    double height = scanner.nextDouble();
                    myCylinder = new Cylinder(height);
                    System.out.println(myCylinder);
                    break;
                case 2:
                    double radius = scanner.nextDouble();
                    double _heigh = scanner.nextDouble();
                    myCylinder = new Cylinder(radius, _heigh);
                    System.out.println(myCylinder);
                    break;
                case 3:
                    double Radius = scanner.nextDouble(), Height = scanner.nextDouble();
                    String Color = scanner.nextLine().replaceFirst(" ", "");
                    myCylinder = new Cylinder(Radius, Height, Color);
                    System.out.println(myCylinder);
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
package Figures;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance < radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance < (circle.radius + this.radius) && distance > Math.abs(circle.radius - this.radius);
    }
}

/*
        Figures.Circle2D c1 = new Figures.Circle2D(2, 2, 5.5);

        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));
        System.out.println("c1.contains(new Figures.Circle2D(4, 5, 10.5)): " + c1.contains(new Figures.Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Figures.Circle2D(3, 5, 2.3)): " + c1.overlaps(new Figures.Circle2D(3, 5, 2.3)));
 */


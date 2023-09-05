package Figures;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(MyPoint p) {
        double area1 = getArea(p1, p2, p);
        double area2 = getArea(p2, p3, p);
        double area3 = getArea(p3, p1, p);
        double triangleArea = getArea();

        return (area1 + area2 + area3 <= triangleArea + 0.0001); // Use a small epsilon to handle floating-point precision issues
    }

    public boolean contains(Triangle2D t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean overlaps(Triangle2D t) {
        // Check if any of the triangles contains a vertex of the other triangle
        return contains(t.p1) || contains(t.p2) || contains(t.p3) ||
                t.contains(p1) || t.contains(p2) || t.contains(p3);
    }

    // Helper method to calculate the area of a triangle formed by three points
    private double getArea(MyPoint p1, MyPoint p2, MyPoint p3) {
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

/*
        Figures.Triangle2D t1 = new Figures.Triangle2D(new Figures.MyPoint(2.5, 2), new Figures.MyPoint(4.2, 3), new Figures.MyPoint(5, 3.5));

        System.out.println("Area of t1: " + t1.getArea());
        System.out.println("Perimeter of t1: " + t1.getPerimeter());
        System.out.println("t1.contains(3, 3): " + t1.contains(new Figures.MyPoint(3, 3)));

        Figures.Triangle2D t2 = new Figures.Triangle2D(new Figures.MyPoint(2.9, 2), new Figures.MyPoint(4, 1), new Figures.MyPoint(1, 3.4));
        System.out.println("t1.contains(t2): " + t1.contains(t2));

        Figures.Triangle2D t3 = new Figures.Triangle2D(new Figures.MyPoint(2, 5.5), new Figures.MyPoint(4, -3), new Figures.MyPoint(2, 6.5));
        System.out.println("t1.overlaps(t3): " + t1.overlaps(t3));
 */

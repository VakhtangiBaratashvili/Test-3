package Figures;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        double minX = this.x - (width / 2);
        double minY = this.y - (height / 2);
        double maxX = this.x + (width / 2);
        double maxY = this.y + (height / 2);

        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }

    public boolean contains(MyRectangle2D r) {
        double minX1 = x - (width / 2);
        double minY1 = y - (height / 2);
        double maxX1 = x + (width / 2);
        double maxY1 = y + (height / 2);

        double minX2 = r.getX() - (r.getWidth() / 2);
        double minY2 = r.getY() - (r.getHeight() / 2);
        double maxX2 = r.getX() + (r.getWidth() / 2);
        double maxY2 = r.getY() + (r.getHeight() / 2);

        return minX1 <= minX2 && minY1 <= minY2 && maxX1 >= maxX2 && maxY1 >= maxY2;
    }

    public boolean overlaps(MyRectangle2D r) {
        double minX1 = x - (width / 2);
        double minY1 = y - (height / 2);
        double maxX1 = x + (width / 2);
        double maxY1 = y + (height / 2);

        double minX2 = r.getX() - (r.getWidth() / 2);
        double minY2 = r.getY() - (r.getHeight() / 2);
        double maxX2 = r.getX() + (r.getWidth() / 2);
        double maxY2 = r.getY() + (r.getHeight() / 2);

        return maxX1 >= minX2 && maxY1 >= minY2 && maxX2 >= minX1 && maxY2 >= minY1;
    }
}

/*
        Figures.MyRectangle2D r1 = new Figures.MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
        System.out.println("r1.contains(3, 3): " + r1.contains(3, 3));

        Figures.MyRectangle2D r2 = new Figures.MyRectangle2D(4, 5, 10.5, 3.2);
        System.out.println("r1.contains(r2): " + r1.contains(r2));

        Figures.MyRectangle2D r3 = new Figures.MyRectangle2D(3, 5, 2.3, 5.4);
        System.out.println("r1.overlaps(r3): " + r1.overlaps(r3));
 */

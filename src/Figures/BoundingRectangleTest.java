package Figures;

import Figures.MyRectangle2D;

import java.util.Scanner;

public class BoundingRectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble(); // x-coordinate
            points[i][1] = input.nextDouble(); // y-coordinate
        }

        MyRectangle2D boundingRectangle = getRectangle(points);

        System.out.println("The bounding rectangle's center (" +
                boundingRectangle.getX() + ", " + boundingRectangle.getY() +
                "), width " + boundingRectangle.getWidth() +
                ", height " + boundingRectangle.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        if (points.length == 0) {
            return new MyRectangle2D();
        }

        double minX = points[0][0];
        double minY = points[0][1];
        double maxX = points[0][0];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            minX = Math.min(minX, points[i][0]);
            minY = Math.min(minY, points[i][1]);
            maxX = Math.max(maxX, points[i][0]);
            maxY = Math.max(maxY, points[i][1]);
        }

        double centerX = (minX + maxX) / 2;
        double centerY = (minY + maxY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;

        return new MyRectangle2D(centerX, centerY, width, height);
    }
}


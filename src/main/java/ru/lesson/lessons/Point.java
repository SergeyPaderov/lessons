package ru.lesson.lessons;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distanceTo(Point p) {

        double lengthX = Math.pow((p.getX() - this.x), 2);
        double lengthY = Math.pow((p.getY() - this.y), 2);
        double result = Math.sqrt(lengthX + lengthY);
        return result;
    }
}

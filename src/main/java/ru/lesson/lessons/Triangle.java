package ru.lesson.lessons;

import java.lang.Math;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(final Point a, final Point b, final Point c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {

        double lengthAB = this.a.distanceTo(this.b);
        double lengthBC = this.b.distanceTo(this.c);
        double lengthCA = this.c.distanceTo(this.a);

        double p = (lengthAB + lengthBC + lengthCA) / 2;

        double result = Math.sqrt(p * (p - lengthAB) * (p - lengthBC) * (p - lengthCA));
        return result;
    }

    public double max() {

        double lenAB = this.a.distanceTo(this.b);
        double lenBC = this.b.distanceTo(this.c);
        double lenCA = this.c.distanceTo(this.a);

        double max = Math.max(lenAB, Math.max(lenBC, lenCA));

        return max;
    }

    public Point getA() {
        return this.a;
    }

    public Point getB() {
        return this.b;
    }

    public Point getC() {
        return this.c;
    }
}

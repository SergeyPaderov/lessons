package ru.lesson.lessons;

public class Start {

    public static void main(String[] args) {

        Point a = new Point(2, 5);
        Point b = new Point(6, 4);
        Point c = new Point(-5, 2);

        if (a.getX() == b.getX() && b.getX() == c.getX()
                || a.getY() == b.getY() && b.getY() == c.getY()) {
            System.out.println("Triangle is not exist");

        } else {

            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Triangle created");
            System.out.println("Triangle's area " + triangle.area());
            System.out.println("Triangles's maximum side is: " + triangle.max());
        }
    }
}

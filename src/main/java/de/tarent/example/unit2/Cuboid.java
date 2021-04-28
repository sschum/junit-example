package de.tarent.example.unit2;

public class Cuboid {
    private Rectangle rectangle;

    public Cuboid(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public double volume(double a, double b, double c) {
        return rectangle.area(a, b) * c;
    }
}

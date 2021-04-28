package de.tarent.example.unit4;

public class Cuboid {
    private Rectangle rectangle;

    public double volume(double a, double b, double c) {
        return rectangle.area(a, b) * c;
    }
}

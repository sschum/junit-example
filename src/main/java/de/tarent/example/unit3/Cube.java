package de.tarent.example.unit3;

public class Cube {

    public double area(double a) {
        return a*a;
    }

    public double volume(double a) {
        return area(a) * a;
    }

    public double surface(double a) {
        return area(a) * 6;
    }
}

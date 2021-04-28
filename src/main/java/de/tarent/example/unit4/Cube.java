package de.tarent.example.unit4;

public class Cube {
    private Square square;

    public double volume(double a) {
        return square.area(a) * a;
    }
}

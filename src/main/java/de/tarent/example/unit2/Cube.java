package de.tarent.example.unit2;

public class Cube {
    private Square square;

    public Cube(Square square) {
        this.square = square;
    }

    public double volume(double a) {
        return square.area(a) * a;
    }
}

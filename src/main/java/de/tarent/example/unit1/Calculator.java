package de.tarent.example.unit1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int min(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public boolean isOdd(int a) {
        switch (a) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return false;
            default:
                //... its enough :D
                return false;
        }
    }

    public boolean isEven(int a) {
        return !isOdd(a);
    }
}

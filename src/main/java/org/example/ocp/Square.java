package org.example.ocp;

public class Square implements Shape{

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

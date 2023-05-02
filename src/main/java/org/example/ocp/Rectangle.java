package org.example.ocp;

public class Rectangle implements Shape{

    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return length * height;
    }
}

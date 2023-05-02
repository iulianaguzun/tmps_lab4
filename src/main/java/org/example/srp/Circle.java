package org.example.srp;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public int getRadius() {
        return radius;
    }

    //before SRP
    public String toJson() {
        return "{radius:" + radius +
                ", area:" + getArea() +
                ", perimeter:" + getPerimeter() + "}\n";
    }

    public String toXml() {
        return "<circle>" +
                "<radius>" + radius + "</radius>" +
                "<area>" + getArea() + "</area>" +
                "<perimeter>" + getPerimeter() + "</perimeter>" +
                "</circle>";
    }
}

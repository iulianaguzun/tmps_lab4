package org.example.srp;

public class ShapeConvertor {

    public String toJson(Circle circle) {
        return "{radius:" + circle.getRadius() +
                ", area:" + circle.getArea() +
                ", perimeter:" + circle.getPerimeter() + "}\n";
    }

    public String toXml(Circle circle) {
        return "<circle>" +
                "<radius>" + circle.getRadius() + "</radius>" +
                "<area>" + circle.getArea() + "</area>" +
                "<perimeter>" + circle.getPerimeter() + "</perimeter>" +
                "</circle>";
    }
}

package org.example.srp;

public class MainSRP {

    public static void main(String[] args) {
        //before SRP
        Circle circle = new Circle(5);
        System.out.println(circle.toJson());
        System.out.println(circle.toXml());

        //after SRP
        ShapeConvertor shapeConvertor = new ShapeConvertor();
        System.out.println(shapeConvertor.toJson(circle));
        System.out.println(shapeConvertor.toXml(circle));
    }

}

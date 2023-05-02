package org.example.ocp;

import java.util.List;

public class ShapeCalculator {

    //before OCP
//    public double getShapeAreaSum(List<Object> shapes) {
//        var sum = 0;
//        for (Object shape : shapes) {
//            if (shape instanceof Square) {
//                sum += ((Square) shape).getLength() * ((Square) shape).getLength();
//            } else if (shape instanceof Rectangle) {
//                sum += ((Rectangle) shape).getLength() * ((Rectangle) shape).getHeight();
//            }
//        }
//
//        return sum;
//    }

    public double getShapeAreaSum(List<Shape> shapes) {
        var sum = 0;
        for (Shape shape : shapes){
            sum += shape.getArea();
        }
        return sum;
    }

    //LSP example
//    public double getArea(){
//        Square shape = new Square(4);
//
//
//        return shape.getArea();
//    }

}

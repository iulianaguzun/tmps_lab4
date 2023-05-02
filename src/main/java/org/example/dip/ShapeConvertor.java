package org.example.dip;

import org.example.ocp.Shape;

import java.util.List;

public class ShapeConvertor {

    private Calculator shapeCalculator;

    //before dip
//    public ShapeConvertor() {
//        this.shapeCalculator = new ShapeCalculator();
//    }

    //after dip


    public ShapeConvertor(Calculator shapeCalculator) {
        this.shapeCalculator = shapeCalculator;
    }

    public String toJson(List<Shape> shapes) {
        String report = "{[";
        int count = 0;
        for (Shape shape : shapes) {
            report += "name: shape" + count + ",area:" + shape.getArea();
        }
        report += "], sum:" + shapeCalculator.getShapeAreaSum(shapes) + "}";
        return report;
    }

}

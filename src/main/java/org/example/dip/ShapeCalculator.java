package org.example.dip;

import org.example.ocp.Shape;

import java.util.List;

public class ShapeCalculator implements Calculator{
    public double getShapeAreaSum(List<Shape> shapes) {
        var sum = 0;
        for (Shape shape : shapes){
            sum += shape.getArea();
        }
        return sum;
    }
}

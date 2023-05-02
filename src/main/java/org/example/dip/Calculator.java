package org.example.dip;

import org.example.ocp.Shape;

import java.util.List;

public interface Calculator {
    double getShapeAreaSum(List<Shape> shapes);
}

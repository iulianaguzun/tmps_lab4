package org.example.isp;

//before isp
//public class Cube implements Shape {
//
//    private int size;
//
//    @Override
//    public double getArea() {
//        return size * size;
//    }
//
//    @Override
//    public double getVolume() {
//        return size * size * size;
//    }
//}

//after isp
public class Cube implements Shape3D{

    private int size;

    @Override
    public double getArea() {
        return size*size;
    }

    @Override
    public double getVolume() {
        return size*size*size;
    }
}

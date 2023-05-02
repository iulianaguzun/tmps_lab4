package org.example.isp;

//before
//public class Square implements Shape {
//    private int length;
//
//    @Override
//    public double getArea() {
//        return length * length;
//    }
//
//    @Override
//    public double getVolume() {
//        throw new UnsupportedOperationException();
//    }
//}

//after
public class Square implements Shape {

    private int size;

    @Override
    public double getArea() {
        return size * size;
    }
}

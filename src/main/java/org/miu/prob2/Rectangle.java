package org.miu.prob2;

public class Rectangle implements Polygon{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    @Override
    public double[] getSides() {
        return new double[]{length, length, width, width};
    }
}

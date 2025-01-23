package org.miu.prob2;

public class Circle implements ClosedCurve{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double computePerimeter() {
        return (Math.PI * 2D) * this.radius;
    }
}

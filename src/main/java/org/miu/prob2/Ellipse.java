package org.miu.prob2;

public class Ellipse implements ClosedCurve {
    private double semiMajorAxis;
    private double ellipIntegralAtEccentricity;

    public Ellipse(double sma, double eie) {
        this.semiMajorAxis = sma;
        this.ellipIntegralAtEccentricity = eie;
    }

    public double computePerimeter() {
        return (double)4.0F * this.semiMajorAxis * this.ellipIntegralAtEccentricity;
    }
}

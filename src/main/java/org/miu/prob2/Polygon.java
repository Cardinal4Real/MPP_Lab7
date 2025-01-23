package org.miu.prob2;

import java.awt.*;

public interface Polygon extends ClosedCurve{

    default double computePerimeter() {
        double perimeter = 0.0;
        for(double val:this.getSides()){
            perimeter += val;
        }
        return perimeter;
    }
    double[] getSides();
}

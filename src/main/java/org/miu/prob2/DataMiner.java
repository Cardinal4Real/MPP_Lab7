package org.miu.prob2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
    List<ClosedCurve> objects = new ArrayList();

    public DataMiner() {
    }

    public static void main(String[] args) {
        DataMiner dm = new DataMiner();
        dm.objects.add(new Rectangle((double)5.0F, (double)7.0F));
        dm.objects.add(new EquilateralTriangle((double)7.0F));
        dm.objects.add(new Rectangle((double)2.0F, (double)9.0F));
        dm.objects.add(new Ellipse((double)3.0F, (double)3.0F));
        dm.objects.add(new Circle((double)6.0F));
        System.out.println(dm.computeAveragePerimeter());
    }

    public double computeAveragePerimeter() {
        if (this.objects != null && !this.objects.isEmpty()) {
            double sum = (double)0.0F;

            for(int i = 0; i < this.objects.size(); ++i) {
                sum += ((ClosedCurve)this.objects.get(i)).computePerimeter();
            }

            return sum / (double)this.objects.size();
        } else {
            return (double)0.0F;
        }
    }
}


package com.google.android.apps.gsa.speech.audio;

import com.google.common.p4535g.C59203do;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.speech.audio.x */
/* compiled from: PG */
public final class C92213x {

    /* renamed from: a */
    public static final C92212w f257089a = new C92212w(-1.69065929318241d, 0.73248077421585d, 1.53512485958697d, -2.69169618940638d, 1.19839281085285d);

    /* renamed from: b */
    public static final C92212w f257090b = new C92212w(-1.99004745483398d, 0.99007225036621d, 1.0d, -2.0d, 1.0d);

    /* renamed from: a */
    public static double m151416a(double[] dArr, double d) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dArr.length; i++) {
            if (m151418c(dArr[i]) > d) {
                arrayList.add(Double.valueOf(dArr[i]));
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        double d2 = C59203do.f157270a;
        if (!isEmpty) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                d2 += ((Double) arrayList.get(i2)).doubleValue();
            }
            double size = (double) arrayList.size();
            Double.isNaN(size);
            d2 /= size;
        }
        return m151418c(d2);
    }

    /* renamed from: b */
    public static void m151417b(double[] dArr, C92212w wVar) {
        double[] dArr2 = dArr;
        C92212w wVar2 = wVar;
        int length = dArr2.length;
        double d = C59203do.f157270a;
        double d2 = 0.0d;
        int i = 0;
        while (i < length) {
            double d3 = dArr2[i];
            double d4 = wVar2.f257084a;
            double d5 = wVar2.f257085b;
            double d6 = (d3 - (d4 * d)) - (d5 * d2);
            double d7 = wVar2.f257086c;
            dArr2[i] = (d3 * d7) + ((wVar2.f257087d - (d4 * d7)) * d) + ((wVar2.f257088e - (d7 * d5)) * d2);
            i++;
            d2 = d;
            d = d6;
        }
    }

    /* renamed from: c */
    private static double m151418c(double d) {
        return (Math.log10(d) * 10.0d) - 6.472d;
    }
}

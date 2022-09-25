package androidx.camera.core.p073b.p077b;

import android.util.Rational;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.camera.core.b.b.c */
/* compiled from: PG */
public final class C1437c {
    /* renamed from: a */
    public static boolean m3897a(int i, int i2, Rational rational) {
        C1974i.m5313a(i2 % 16 == 0);
        double numerator = (double) (i * rational.getNumerator());
        double denominator = (double) rational.getDenominator();
        Double.isNaN(numerator);
        Double.isNaN(denominator);
        double d = numerator / denominator;
        return d > ((double) Math.max(0, i2 + -16)) && d < ((double) (i2 + 16));
    }
}

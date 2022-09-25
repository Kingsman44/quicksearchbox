package androidx.constraintlayout.p079a.p080a.p081a;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a.a.n */
/* compiled from: PG */
public final class C1604n {

    /* renamed from: a */
    float[] f4430a = new float[0];

    /* renamed from: b */
    double[] f4431b = new double[0];

    /* renamed from: c */
    double[] f4432c;

    /* renamed from: d */
    String f4433d;

    /* renamed from: e */
    C1603m f4434e;

    /* renamed from: f */
    int f4435f;

    /* renamed from: g */
    final double f4436g = 6.283185307179586d;

    /* renamed from: a */
    public final void mo4532a(double d, float f) {
        int length = this.f4430a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f4431b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f4431b = Arrays.copyOf(this.f4431b, length);
        this.f4430a = Arrays.copyOf(this.f4430a, length);
        this.f4432c = new double[length];
        double[] dArr = this.f4431b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f4431b[binarySearch] = d;
        this.f4430a[binarySearch] = f;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f4431b);
        String arrays2 = Arrays.toString(this.f4430a);
        return "pos =" + arrays + " period=" + arrays2;
    }
}

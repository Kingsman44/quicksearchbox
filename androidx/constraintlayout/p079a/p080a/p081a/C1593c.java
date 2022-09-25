package androidx.constraintlayout.p079a.p080a.p081a;

/* renamed from: androidx.constraintlayout.a.a.a.c */
/* compiled from: PG */
final class C1593c extends C1594d {

    /* renamed from: a */
    final double f4392a;

    /* renamed from: b */
    final double[] f4393b;

    public C1593c(double d, double[] dArr) {
        this.f4392a = d;
        this.f4393b = dArr;
    }

    /* renamed from: a */
    public final void mo4516a(double d, double[] dArr) {
        double[] dArr2 = this.f4393b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    /* renamed from: b */
    public final void mo4517b(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f4393b;
            if (i < dArr.length) {
                fArr[i] = (float) dArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo4518c(double d, double[] dArr) {
        for (int i = 0; i < this.f4393b.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    /* renamed from: d */
    public final double[] mo4519d() {
        return new double[]{this.f4392a};
    }

    /* renamed from: e */
    public final double mo4520e(double d) {
        return this.f4393b[0];
    }
}

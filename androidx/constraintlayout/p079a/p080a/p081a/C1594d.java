package androidx.constraintlayout.p079a.p080a.p081a;

/* renamed from: androidx.constraintlayout.a.a.a.d */
/* compiled from: PG */
public abstract class C1594d {
    /* renamed from: f */
    public static C1594d m4236f(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length != 1) {
            if (i == 0) {
                return new C1603m(dArr, dArr2);
            }
            if (i != 2) {
                return new C1602l(dArr, dArr2);
            }
        }
        return new C1593c(dArr[0], dArr2[0]);
    }

    /* renamed from: a */
    public abstract void mo4516a(double d, double[] dArr);

    /* renamed from: b */
    public abstract void mo4517b(double d, float[] fArr);

    /* renamed from: c */
    public abstract void mo4518c(double d, double[] dArr);

    /* renamed from: d */
    public abstract double[] mo4519d();

    /* renamed from: e */
    public abstract double mo4520e(double d);
}

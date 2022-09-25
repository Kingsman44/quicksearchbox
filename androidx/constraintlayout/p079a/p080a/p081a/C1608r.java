package androidx.constraintlayout.p079a.p080a.p081a;

/* renamed from: androidx.constraintlayout.a.a.a.r */
/* compiled from: PG */
public final class C1608r implements C1610t {

    /* renamed from: a */
    public double f4444a = 0.5d;

    /* renamed from: b */
    public double f4445b;

    /* renamed from: c */
    public double f4446c;

    /* renamed from: d */
    public float f4447d;

    /* renamed from: e */
    public float f4448e;

    /* renamed from: f */
    public float f4449f;

    /* renamed from: g */
    public float f4450g;

    /* renamed from: h */
    public int f4451h = 0;

    /* renamed from: i */
    private float f4452i;

    /* renamed from: a */
    public final float mo4538a(float f) {
        C1608r rVar = this;
        float f2 = f;
        double d = (double) (f2 - rVar.f4447d);
        double d2 = rVar.f4445b;
        double d3 = rVar.f4444a;
        double d4 = (double) rVar.f4449f;
        Double.isNaN(d4);
        double sqrt = Math.sqrt(d2 / d4);
        Double.isNaN(d);
        int i = (int) ((9.0d / ((sqrt * d) * 4.0d)) + 1.0d);
        double d5 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d5);
        double d6 = d / d5;
        int i2 = 0;
        while (i2 < i) {
            double d7 = (double) rVar.f4448e;
            double d8 = rVar.f4446c;
            double d9 = (double) rVar.f4452i;
            int i3 = i;
            int i4 = i2;
            double d10 = (double) rVar.f4449f;
            Double.isNaN(d7);
            Double.isNaN(d9);
            Double.isNaN(d10);
            Double.isNaN(d9);
            double d11 = ((((((-d2) * (d7 - d8)) - (d3 * d9)) / d10) * d6) / 2.0d) + d9;
            Double.isNaN(d7);
            Double.isNaN(d10);
            double d12 = ((((-((d7 + ((d6 * d11) / 2.0d)) - d8)) * d2) - (d11 * d3)) / d10) * d6;
            Double.isNaN(d9);
            float f3 = (float) (d9 + d12);
            this.f4452i = f3;
            Double.isNaN(d9);
            Double.isNaN(d7);
            float f4 = (float) (d7 + ((d9 + (d12 / 2.0d)) * d6));
            this.f4448e = f4;
            int i5 = this.f4451h;
            if (i5 > 0) {
                if (f4 < 0.0f && (i5 & 1) == 1) {
                    f4 = -f4;
                    this.f4448e = f4;
                    f3 = -f3;
                    this.f4452i = f3;
                }
                if (f4 > 1.0f && (i5 & 2) == 2) {
                    this.f4448e = 2.0f - f4;
                    this.f4452i = -f3;
                }
            }
            i2 = i4 + 1;
            rVar = this;
            i = i3;
            f2 = f;
        }
        float f5 = f2;
        C1608r rVar2 = rVar;
        rVar2.f4447d = f5;
        return rVar2.f4448e;
    }

    /* renamed from: b */
    public final float mo4539b() {
        return 0.0f;
    }

    /* renamed from: c */
    public final boolean mo4540c() {
        double d = (double) this.f4448e;
        double d2 = this.f4446c;
        Double.isNaN(d);
        double d3 = d - d2;
        double d4 = this.f4445b;
        double d5 = (double) this.f4452i;
        Double.isNaN(d5);
        Double.isNaN(d5);
        double d6 = (double) this.f4449f;
        Double.isNaN(d6);
        return Math.sqrt((((d5 * d5) * d6) + ((d4 * d3) * d3)) / d4) <= ((double) this.f4450g);
    }
}

package androidx.constraintlayout.p079a.p080a.p081a;

/* renamed from: androidx.constraintlayout.a.a.a.u */
/* compiled from: PG */
public final class C1611u implements C1610t {

    /* renamed from: a */
    public boolean f4454a = false;

    /* renamed from: b */
    public float f4455b;

    /* renamed from: c */
    private float f4456c;

    /* renamed from: d */
    private float f4457d;

    /* renamed from: e */
    private float f4458e;

    /* renamed from: f */
    private float f4459f;

    /* renamed from: g */
    private float f4460g;

    /* renamed from: h */
    private float f4461h;

    /* renamed from: i */
    private float f4462i;

    /* renamed from: j */
    private float f4463j;

    /* renamed from: k */
    private float f4464k;

    /* renamed from: l */
    private int f4465l;

    /* renamed from: m */
    private float f4466m;

    /* renamed from: a */
    public final float mo4538a(float f) {
        float f2;
        float f3 = this.f4459f;
        if (f <= f3) {
            float f4 = this.f4456c;
            f2 = (f4 * f) + ((((this.f4457d - f4) * f) * f) / (f3 + f3));
        } else {
            int i = this.f4465l;
            if (i == 1) {
                f2 = this.f4462i;
            } else {
                float f5 = f - f3;
                float f6 = this.f4460g;
                if (f5 < f6) {
                    float f7 = this.f4462i;
                    float f8 = this.f4457d;
                    f2 = f7 + (f8 * f5) + ((((this.f4458e - f8) * f5) * f5) / (f6 + f6));
                } else if (i == 2) {
                    f2 = this.f4463j;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f4461h;
                    if (f9 <= f10) {
                        float f11 = this.f4463j;
                        float f12 = this.f4458e * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 + f10));
                    } else {
                        f2 = this.f4464k;
                    }
                }
            }
        }
        this.f4466m = f;
        return this.f4454a ? this.f4455b - f2 : this.f4455b + f2;
    }

    /* renamed from: b */
    public final float mo4539b() {
        return this.f4454a ? -mo4541d(this.f4466m) : mo4541d(this.f4466m);
    }

    /* renamed from: c */
    public final boolean mo4540c() {
        return mo4539b() < 1.0E-5f && Math.abs(this.f4464k - this.f4466m) < 1.0E-5f;
    }

    /* renamed from: d */
    public final float mo4541d(float f) {
        float f2 = this.f4459f;
        if (f <= f2) {
            float f3 = this.f4456c;
            return f3 + (((this.f4457d - f3) * f) / f2);
        }
        int i = this.f4465l;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f4460g;
        if (f4 < f5) {
            float f6 = this.f4457d;
            return f6 + (((this.f4458e - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f4463j;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f4461h;
            if (f7 >= f8) {
                return this.f4464k;
            }
            float f9 = this.f4458e;
            return f9 - ((f7 * f9) / f8);
        }
    }

    /* renamed from: e */
    public final void mo4542e(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f4456c = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f4465l = 2;
                this.f4456c = f;
                this.f4457d = sqrt;
                this.f4458e = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f4459f = f8;
                this.f4460g = sqrt / f3;
                this.f4462i = ((f + sqrt) * f8) / 2.0f;
                this.f4463j = f2;
                this.f4464k = f2;
                return;
            }
            this.f4465l = 3;
            this.f4456c = f;
            this.f4457d = f4;
            this.f4458e = f4;
            float f9 = (f4 - f) / f3;
            this.f4459f = f9;
            float f10 = f4 / f3;
            this.f4461h = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f4460g = ((f2 - f11) - f12) / f4;
            this.f4462i = f11;
            this.f4463j = f2 - f12;
            this.f4464k = f2;
        } else if (f7 >= f2) {
            this.f4465l = 1;
            this.f4457d = 0.0f;
            this.f4462i = f2;
            this.f4459f = (f2 + f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f4465l = 2;
                this.f4457d = f;
                this.f4458e = 0.0f;
                this.f4462i = f13;
                this.f4463j = f2;
                this.f4459f = f14;
                this.f4460g = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            float f16 = sqrt2 / f3;
            if (sqrt2 < f4) {
                this.f4465l = 2;
                this.f4456c = f;
                this.f4457d = sqrt2;
                this.f4458e = 0.0f;
                this.f4459f = f15;
                this.f4460g = f16;
                this.f4462i = ((f + sqrt2) * f15) / 2.0f;
                this.f4463j = f2;
                return;
            }
            this.f4465l = 3;
            this.f4456c = f;
            this.f4457d = f4;
            this.f4458e = f4;
            float f17 = (f4 - f) / f3;
            this.f4459f = f17;
            float f18 = f4 / f3;
            this.f4461h = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f4460g = ((f2 - f19) - f20) / f4;
            this.f4462i = f19;
            this.f4463j = f2 - f20;
            this.f4464k = f2;
        }
    }
}

package androidx.constraintlayout.motion.widget;

/* renamed from: androidx.constraintlayout.motion.widget.v */
/* compiled from: PG */
final class C1737v extends C1735t {

    /* renamed from: a */
    float f5165a = 0.0f;

    /* renamed from: b */
    float f5166b = 0.0f;

    /* renamed from: c */
    float f5167c;

    /* renamed from: d */
    final /* synthetic */ MotionLayout f5168d;

    public C1737v(MotionLayout motionLayout) {
        this.f5168d = motionLayout;
    }

    /* renamed from: a */
    public final float mo4708a() {
        return this.f5168d.f4855e;
    }

    /* renamed from: b */
    public final void mo4813b(float f, float f2, float f3) {
        this.f5165a = f;
        this.f5166b = f2;
        this.f5167c = f3;
    }

    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f5165a;
        if (f3 > 0.0f) {
            float f4 = this.f5167c;
            float f5 = f3 / f4;
            if (f5 < f) {
                f = f5;
            }
            float f6 = f4 * f;
            this.f5168d.f4855e = f3 - f6;
            f2 = (f3 * f) - ((f6 * f) / 2.0f);
        } else {
            float f7 = this.f5167c;
            float f8 = (-f3) / f7;
            if (f8 < f) {
                f = f8;
            }
            float f9 = f7 * f;
            this.f5168d.f4855e = f3 + f9;
            f2 = (f3 * f) + ((f9 * f) / 2.0f);
        }
        return f2 + this.f5166b;
    }
}

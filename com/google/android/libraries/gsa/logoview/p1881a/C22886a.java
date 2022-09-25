package com.google.android.libraries.gsa.logoview.p1881a;

/* renamed from: com.google.android.libraries.gsa.logoview.a.a */
/* compiled from: PG */
public final class C22886a extends C22888c {

    /* renamed from: a */
    public boolean f63011a = true;

    public C22886a(float f) {
        super(80.0f, f);
    }

    /* renamed from: i */
    private static final float m42763i(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo28233a() {
        float f = this.f63012b - this.f63013c;
        if (Math.abs(f) < 0.3926991f) {
            return f;
        }
        float f2 = 6.2831855f + f;
        if (Math.abs(f2) < 0.3926991f) {
            return f2;
        }
        return this.f63011a ? f < -0.3926991f ? f2 : f : f > 0.3926991f ? f - 0.7146018f : f;
    }

    /* renamed from: b */
    public final void mo28234b(float f) {
        this.f63013c = m42763i(this.f63013c + f);
        this.f63012b = m42763i(this.f63012b + f);
    }

    /* renamed from: c */
    public final void mo28235c(float f) {
        super.mo28235c(m42763i(f));
    }

    /* renamed from: d */
    public final void mo28236d(float f, float f2) {
        super.mo28236d(f, f2);
        this.f63013c = m42763i(this.f63013c);
    }
}

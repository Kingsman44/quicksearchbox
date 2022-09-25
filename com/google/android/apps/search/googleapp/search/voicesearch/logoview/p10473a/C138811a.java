package com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.a.a */
/* compiled from: PG */
public final class C138811a extends C138813c {

    /* renamed from: a */
    public boolean f377587a = true;

    public C138811a(float f) {
        super(80.0f, f);
    }

    /* renamed from: i */
    private static final float m225464i(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo114558a() {
        float f = this.f377588b - this.f377589c;
        if (Math.abs(f) < 0.3926991f) {
            return f;
        }
        float f2 = 6.2831855f + f;
        if (Math.abs(f2) < 0.3926991f) {
            return f2;
        }
        return this.f377587a ? f < -0.3926991f ? f2 : f : f > 0.3926991f ? f - 0.7146018f : f;
    }

    /* renamed from: b */
    public final void mo114559b(float f) {
        this.f377589c = m225464i(this.f377589c + f);
        this.f377588b = m225464i(this.f377588b + f);
    }

    /* renamed from: c */
    public final void mo114560c(float f) {
        super.mo114560c(m225464i(f));
    }

    /* renamed from: d */
    public final void mo114561d(float f, float f2) {
        super.mo114561d(f, f2);
        this.f377589c = m225464i(this.f377589c);
    }
}

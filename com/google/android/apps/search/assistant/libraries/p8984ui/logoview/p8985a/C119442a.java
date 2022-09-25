package com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.a.a */
/* compiled from: PG */
public final class C119442a extends C119444c {

    /* renamed from: a */
    public boolean f332973a = true;

    public C119442a(float f) {
        super(80.0f, f);
    }

    /* renamed from: i */
    private static final float m198185i(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo104355a() {
        float f = this.f332974b - this.f332975c;
        if (Math.abs(f) < 0.3926991f) {
            return f;
        }
        float f2 = 6.2831855f + f;
        if (Math.abs(f2) < 0.3926991f) {
            return f2;
        }
        return this.f332973a ? f < -0.3926991f ? f2 : f : f > 0.3926991f ? f - 0.7146018f : f;
    }

    /* renamed from: b */
    public final void mo104356b(float f) {
        this.f332975c = m198185i(this.f332975c + f);
        this.f332974b = m198185i(this.f332974b + f);
    }

    /* renamed from: c */
    public final void mo104357c(float f) {
        super.mo104357c(m198185i(f));
    }

    /* renamed from: d */
    public final void mo104358d(float f, float f2) {
        super.mo104358d(f, f2);
        this.f332975c = m198185i(this.f332975c);
    }
}

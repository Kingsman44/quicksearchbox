package com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.a.b */
/* compiled from: PG */
public class C138812b {

    /* renamed from: b */
    public float f377588b;

    /* renamed from: c */
    public float f377589c;

    /* renamed from: d */
    public float f377590d;

    /* renamed from: e */
    public boolean f377591e = true;

    /* renamed from: f */
    protected float f377592f;

    /* renamed from: g */
    protected float f377593g;

    public C138812b(float f) {
        mo114564g(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo114558a() {
        return this.f377588b - this.f377589c;
    }

    /* renamed from: c */
    public void mo114560c(float f) {
        if (f != this.f377588b) {
            this.f377588b = f;
            this.f377591e = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo114561d(float f, float f2) {
        float f3 = this.f377590d + (f * f2);
        this.f377590d = f3;
        this.f377589c += f3 * f2;
    }

    /* renamed from: e */
    public final void mo114562e(float f) {
        this.f377589c = f;
        this.f377588b = f;
        this.f377590d = 0.0f;
        this.f377591e = true;
    }

    /* renamed from: f */
    public final void mo114563f(long j) {
        if (!this.f377591e) {
            mo114561d((this.f377592f * mo114558a()) - (this.f377593g * this.f377590d), ((float) Math.min(j, 50)) / 1000.0f);
            float abs = Math.abs(mo114558a());
            float abs2 = Math.abs(this.f377590d);
            boolean z = false;
            if (abs < 0.001f && abs2 < 0.001f) {
                z = true;
            }
            this.f377591e = z;
            if (z) {
                this.f377589c = this.f377588b;
                this.f377590d = 0.0f;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo114564g(float f) {
        this.f377592f = f;
        this.f377593g = (float) (Math.sqrt((double) f) * 1.7999999523162842d);
    }
}

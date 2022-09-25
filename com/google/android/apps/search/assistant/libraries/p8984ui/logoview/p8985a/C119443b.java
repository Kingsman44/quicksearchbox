package com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.a.b */
/* compiled from: PG */
public class C119443b {

    /* renamed from: b */
    public float f332974b;

    /* renamed from: c */
    public float f332975c;

    /* renamed from: d */
    public float f332976d;

    /* renamed from: e */
    public boolean f332977e = true;

    /* renamed from: f */
    protected float f332978f;

    /* renamed from: g */
    protected float f332979g;

    public C119443b(float f) {
        mo104361g(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo104355a() {
        return this.f332974b - this.f332975c;
    }

    /* renamed from: c */
    public void mo104357c(float f) {
        if (f != this.f332974b) {
            this.f332974b = f;
            this.f332977e = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo104358d(float f, float f2) {
        float f3 = this.f332976d + (f * f2);
        this.f332976d = f3;
        this.f332975c += f3 * f2;
    }

    /* renamed from: e */
    public final void mo104359e(float f) {
        this.f332975c = f;
        this.f332974b = f;
        this.f332976d = 0.0f;
        this.f332977e = true;
    }

    /* renamed from: f */
    public final void mo104360f(long j) {
        if (!this.f332977e) {
            mo104358d((this.f332978f * mo104355a()) - (this.f332979g * this.f332976d), ((float) Math.min(j, 50)) / 1000.0f);
            float abs = Math.abs(mo104355a());
            float abs2 = Math.abs(this.f332976d);
            boolean z = false;
            if (abs < 0.001f && abs2 < 0.001f) {
                z = true;
            }
            this.f332977e = z;
            if (z) {
                this.f332975c = this.f332974b;
                this.f332976d = 0.0f;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo104361g(float f) {
        this.f332978f = f;
        this.f332979g = (float) (Math.sqrt((double) f) * 1.7999999523162842d);
    }
}

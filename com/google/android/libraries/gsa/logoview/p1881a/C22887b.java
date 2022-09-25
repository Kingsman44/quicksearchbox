package com.google.android.libraries.gsa.logoview.p1881a;

/* renamed from: com.google.android.libraries.gsa.logoview.a.b */
/* compiled from: PG */
public class C22887b {

    /* renamed from: b */
    public float f63012b;

    /* renamed from: c */
    public float f63013c;

    /* renamed from: d */
    public float f63014d;

    /* renamed from: e */
    public boolean f63015e = true;

    /* renamed from: f */
    protected float f63016f;

    /* renamed from: g */
    protected float f63017g;

    public C22887b(float f) {
        mo28239g(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo28233a() {
        return this.f63012b - this.f63013c;
    }

    /* renamed from: c */
    public void mo28235c(float f) {
        if (f != this.f63012b) {
            this.f63012b = f;
            this.f63015e = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo28236d(float f, float f2) {
        float f3 = this.f63014d + (f * f2);
        this.f63014d = f3;
        this.f63013c += f3 * f2;
    }

    /* renamed from: e */
    public final void mo28237e(float f) {
        this.f63013c = f;
        this.f63012b = f;
        this.f63014d = 0.0f;
        this.f63015e = true;
    }

    /* renamed from: f */
    public final void mo28238f(long j) {
        if (!this.f63015e) {
            mo28236d((this.f63016f * mo28233a()) - (this.f63017g * this.f63014d), ((float) Math.min(j, 50)) / 1000.0f);
            float abs = Math.abs(mo28233a());
            float abs2 = Math.abs(this.f63014d);
            boolean z = false;
            if (abs < 0.001f && abs2 < 0.001f) {
                z = true;
            }
            this.f63015e = z;
            if (z) {
                this.f63013c = this.f63012b;
                this.f63014d = 0.0f;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo28239g(float f) {
        this.f63016f = f;
        this.f63017g = (float) (Math.sqrt((double) f) * 1.7999999523162842d);
    }
}

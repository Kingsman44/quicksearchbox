package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10643a;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.a.b */
/* compiled from: PG */
public final class C141473b {

    /* renamed from: a */
    public float f383997a;

    /* renamed from: b */
    public float f383998b;

    /* renamed from: c */
    public float f383999c;

    /* renamed from: d */
    public boolean f384000d = true;

    /* renamed from: e */
    public boolean f384001e;

    /* renamed from: f */
    private float f384002f;

    /* renamed from: g */
    private float f384003g;

    /* renamed from: h */
    private final float f384004h;

    /* renamed from: i */
    private final float f384005i;

    public C141473b(float f, float f2, float f3) {
        mo116480e(f);
        this.f384004h = f2;
        this.f384005i = f3;
    }

    /* renamed from: f */
    private final float m229600f() {
        float f = this.f383997a - this.f383998b;
        if (this.f384004h <= 0.0f || Math.abs(f) < this.f384005i) {
            return f;
        }
        float abs = Math.abs(this.f384004h + f);
        float f2 = this.f384005i;
        if (abs < f2) {
            return f + this.f384004h;
        }
        return this.f384001e ? f < (-f2) ? f + this.f384004h : f : f > f2 ? f - this.f384004h : f;
    }

    /* renamed from: a */
    public final float mo116476a(float f) {
        float f2 = this.f384004h;
        if (f2 <= 0.0f) {
            return f;
        }
        float f3 = f % f2;
        return f3 < 0.0f ? f3 + f2 : f3;
    }

    /* renamed from: b */
    public final void mo116477b(float f) {
        this.f383998b = f;
        this.f383997a = f;
        this.f383999c = 0.0f;
        this.f384000d = true;
    }

    /* renamed from: c */
    public final void mo116478c(float f) {
        float a = mo116476a(f);
        if (a != this.f383997a) {
            this.f383997a = a;
            this.f384000d = false;
        }
    }

    /* renamed from: d */
    public final void mo116479d(long j) {
        if (!this.f384000d) {
            float f = this.f384002f;
            float f2 = m229600f();
            float f3 = this.f384003g;
            float f4 = this.f383999c;
            float min = ((float) Math.min(j, 50)) / 1000.0f;
            float f5 = this.f383999c + (((f * f2) - (f3 * f4)) * min);
            this.f383999c = f5;
            this.f383998b = mo116476a(this.f383998b + (f5 * min));
            float abs = Math.abs(m229600f());
            float abs2 = Math.abs(this.f383999c);
            boolean z = false;
            if (abs < 0.001f && abs2 < 0.001f) {
                z = true;
            }
            this.f384000d = z;
            if (z) {
                this.f383998b = this.f383997a;
                this.f383999c = 0.0f;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo116480e(float f) {
        this.f384002f = f;
        this.f384003g = (float) (Math.sqrt((double) f) * 1.7999999523162842d);
    }
}

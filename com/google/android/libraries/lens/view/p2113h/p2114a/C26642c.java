package com.google.android.libraries.lens.view.p2113h.p2114a;

/* renamed from: com.google.android.libraries.lens.view.h.a.c */
/* compiled from: PG */
public class C26642c {

    /* renamed from: a */
    protected volatile float f72650a = 0.0f;

    /* renamed from: b */
    protected volatile long f72651b = 0;

    /* renamed from: a */
    public final synchronized float mo31931a() {
        float f;
        f = this.f72650a;
        mo31933c();
        return f;
    }

    /* renamed from: b */
    public synchronized void mo31932b(float f) {
        float f2 = this.f72650a;
        float f3 = this.f72650a;
        long j = this.f72651b + 1;
        this.f72651b = j;
        this.f72650a = f2 + ((f - f3) / ((float) j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo31933c() {
        this.f72650a = 0.0f;
        this.f72651b = 0;
    }
}

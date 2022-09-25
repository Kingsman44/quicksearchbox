package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* compiled from: PG */
abstract class C145355f extends C145328e {

    /* renamed from: a */
    public boolean f392901a;

    public C145355f(C145361ff ffVar) {
        super(ffVar);
        this.f393011w.mo120978p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo120949a() {
        if (!mo120951c()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: b */
    public final void mo120950b() {
        if (this.f392901a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo120873d()) {
            this.f393011w.f392955y.incrementAndGet();
            this.f392901a = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo120951c() {
        return this.f392901a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo120873d();
}

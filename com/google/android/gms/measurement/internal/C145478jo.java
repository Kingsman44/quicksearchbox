package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.jo */
/* compiled from: PG */
abstract class C145478jo extends C145477jn {

    /* renamed from: a */
    private boolean f393328a;

    public C145478jo(C145488jy jyVar) {
        super(jyVar);
        this.f393327l.f393367o++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo121194J() {
        if (!mo121196L()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: K */
    public final void mo121195K() {
        if (this.f393328a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo120805c()) {
            this.f393327l.f393368p++;
            this.f393328a = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo121196L() {
        return this.f393328a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo120805c();
}

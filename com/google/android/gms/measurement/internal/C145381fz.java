package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fz */
/* compiled from: PG */
abstract class C145381fz extends C145380fy {

    /* renamed from: a */
    private boolean f393012a;

    public C145381fz(C145361ff ffVar) {
        super(ffVar);
        this.f393011w.mo120978p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public void mo120922at() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo120834b();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo121002k() {
        if (!mo121005n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo121003l() {
        if (this.f393012a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo120834b()) {
            this.f393011w.f392955y.incrementAndGet();
            this.f393012a = true;
        }
    }

    /* renamed from: m */
    public final void mo121004m() {
        if (!this.f393012a) {
            mo120922at();
            this.f393011w.f392955y.incrementAndGet();
            this.f393012a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo121005n() {
        return this.f393012a;
    }
}

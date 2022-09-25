package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.g */
/* compiled from: PG */
public abstract class C143932g {

    /* renamed from: d */
    public Object f390122d;

    /* renamed from: e */
    public boolean f390123e = false;

    /* renamed from: f */
    final /* synthetic */ C143939n f390124f;

    public C143932g(C143939n nVar, Object obj) {
        this.f390124f = nVar;
        this.f390122d = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo119438b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo119440d();

    /* renamed from: e */
    public final void mo119442e() {
        synchronized (this) {
            this.f390122d = null;
        }
    }

    /* renamed from: f */
    public final void mo119443f() {
        mo119442e();
        synchronized (this.f390124f.f390162z) {
            this.f390124f.f390162z.remove(this);
        }
    }
}

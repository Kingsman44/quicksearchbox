package com.google.android.gms.analytics.internal;

/* renamed from: com.google.android.gms.analytics.internal.g */
/* compiled from: PG */
public abstract class C142737g extends C142736f {

    /* renamed from: a */
    private boolean f387329a;

    protected C142737g(C142740j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo117488a();

    /* renamed from: k */
    public final void mo117537k() {
        if (!mo117539m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo117538l() {
        mo117488a();
        this.f387329a = true;
    }

    /* renamed from: m */
    public final boolean mo117539m() {
        return this.f387329a;
    }
}

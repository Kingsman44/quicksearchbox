package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adm */
/* compiled from: PG */
public final class adm {

    /* renamed from: a */
    private boolean f20373a;

    /* renamed from: a */
    public final synchronized boolean mo14489a() {
        if (this.f20373a) {
            return false;
        }
        this.f20373a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo14490b() {
        while (!this.f20373a) {
            wait();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo14491c() {
        return this.f20373a;
    }

    /* renamed from: d */
    public final synchronized void mo14492d() {
        this.f20373a = false;
    }
}

package com.bumptech.glide.p291h;

/* renamed from: com.bumptech.glide.h.j */
/* compiled from: PG */
public final class C5623j implements C5624k {

    /* renamed from: a */
    final /* synthetic */ C5624k f16961a;

    /* renamed from: b */
    private volatile Object f16962b;

    public C5623j(C5624k kVar) {
        this.f16961a = kVar;
    }

    /* renamed from: a */
    public final Object mo12074a() {
        if (this.f16962b == null) {
            synchronized (this) {
                if (this.f16962b == null) {
                    Object a = this.f16961a.mo12074a();
                    C5630q.m14607d(a, "Argument must not be null");
                    this.f16962b = a;
                }
            }
        }
        return this.f16962b;
    }
}

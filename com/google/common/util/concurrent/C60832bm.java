package com.google.common.util.concurrent;

/* renamed from: com.google.common.util.concurrent.bm */
/* compiled from: PG */
final class C60832bm implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60834bo f164910a;

    /* renamed from: b */
    final /* synthetic */ C60930r f164911b;

    public C60832bm(C60834bo boVar, C60930r rVar) {
        this.f164910a = boVar;
        this.f164911b = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        if (!this.f164910a.compareAndSet(C60833bn.NOT_RUN, C60833bn.STARTED)) {
            return C60856cj.m92898g();
        }
        return this.f164911b.mo18058a();
    }

    public final String toString() {
        return this.f164911b.toString();
    }
}

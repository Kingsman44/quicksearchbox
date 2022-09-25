package com.google.android.libraries.p2460r.p2469c;

import android.util.LruCache;

/* renamed from: com.google.android.libraries.r.c.af */
/* compiled from: PG */
final class C32075af implements C32092aw {

    /* renamed from: a */
    private final LruCache f86121a;

    public C32075af(int i) {
        this.f86121a = new LruCache(i);
    }

    /* renamed from: a */
    public final C32138p mo37856a(C32091av avVar) {
        C32093ax axVar;
        if (avVar == null || (axVar = (C32093ax) this.f86121a.get(avVar)) == null) {
            return null;
        }
        return axVar.mo37856a(avVar);
    }

    /* renamed from: b */
    public final void mo37857b(C32091av avVar, C32138p pVar) {
        C32093ax axVar = (C32093ax) this.f86121a.get(avVar);
        if (axVar == null) {
            axVar = new C32093ax(avVar);
            this.f86121a.put(avVar, axVar);
        }
        axVar.mo37857b(avVar, pVar);
    }
}

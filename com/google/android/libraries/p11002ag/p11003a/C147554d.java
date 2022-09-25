package com.google.android.libraries.p11002ag.p11003a;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.libraries.ag.a.d */
/* compiled from: PG */
final class C147554d {

    /* renamed from: a */
    public final int f398249a;

    /* renamed from: b */
    private final LinkedHashMap f398250b;

    public C147554d(int i) {
        this.f398249a = i;
        this.f398250b = new C147553c(this, ((i * 4) / 3) + 1);
    }

    /* renamed from: a */
    public final synchronized Object mo124307a(Object obj) {
        return this.f398250b.get(obj);
    }

    /* renamed from: b */
    public final synchronized void mo124308b(Object obj, Object obj2) {
        this.f398250b.put(obj, obj2);
    }
}

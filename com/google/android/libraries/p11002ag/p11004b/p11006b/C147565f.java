package com.google.android.libraries.p11002ag.p11004b.p11006b;

import com.google.android.libraries.p11002ag.C147579i;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.ag.b.b.f */
/* compiled from: PG */
public final class C147565f implements C147567h {

    /* renamed from: a */
    public final C147564e f398264a;

    /* renamed from: b */
    private final ConcurrentMap f398265b = new ConcurrentHashMap();

    private C147565f(C147564e eVar) {
        this.f398264a = eVar;
    }

    /* renamed from: c */
    public static C147565f m240601c() {
        return new C147565f(new C147563d());
    }

    /* renamed from: d */
    static C147565f m240602d() {
        return new C147565f(new C147562c());
    }

    /* renamed from: a */
    public final void mo124311a(C147579i iVar) {
        this.f398265b.put(this.f398264a.mo124312a(iVar), iVar);
    }

    /* renamed from: b */
    public final C147579i mo124313b(Object obj) {
        if (obj != null) {
            return (C147579i) this.f398265b.get(obj);
        }
        return null;
    }
}

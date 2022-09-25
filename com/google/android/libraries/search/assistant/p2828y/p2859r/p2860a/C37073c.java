package com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a;

import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36908b;
import com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a.C37066b;
import com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a.C37069e;
import com.google.protobuf.C62912at;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.ConcurrentMap;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.y.r.a.c */
/* compiled from: PG */
public final class C37073c extends C37069e {

    /* renamed from: a */
    private final ConcurrentMap f96566a = new ConcurrentHashMap();

    /* renamed from: b */
    public final void mo40603b(C37066b bVar, C70862aj ajVar) {
        ConcurrentMap concurrentMap = this.f96566a;
        C65753ak b = C65753ak.m96797b(bVar.f96557b);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        if (concurrentMap.containsKey(b)) {
            ConcurrentMap concurrentMap2 = this.f96566a;
            C65753ak b2 = C65753ak.m96797b(bVar.f96557b);
            if (b2 == null) {
                b2 = C65753ak.UNKNOWN;
            }
            for (Runnable run : ((ConcurrentMap) concurrentMap2.get(b2)).values()) {
                run.run();
            }
            ajVar.mo20123c(C62912at.f169862a);
            ajVar.mo20121a();
        }
    }

    /* renamed from: c */
    public final synchronized void mo40606c(C36908b bVar, C65753ak akVar, Runnable runnable) {
        this.f96566a.putIfAbsent(akVar, new ConcurrentHashMap());
        ((ConcurrentMap) this.f96566a.get(akVar)).put(bVar, runnable);
    }

    /* renamed from: d */
    public final synchronized void mo40607d(C36908b bVar, C65753ak akVar) {
        ((ConcurrentMap) ConcurrentMap.EL.getOrDefault(this.f96566a, akVar, new ConcurrentHashMap())).remove(bVar);
    }
}

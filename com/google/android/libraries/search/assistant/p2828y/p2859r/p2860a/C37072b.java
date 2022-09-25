package com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a;

import android.accounts.Account;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36908b;
import com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a.C37065a;
import com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a.C37066b;
import com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a.C37068d;
import com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a.C37071g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.ConcurrentMap;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.assistant.y.r.a.b */
/* compiled from: PG */
public final class C37072b implements C21851cg {

    /* renamed from: a */
    public static final C59071e f96561a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.r.a.b");

    /* renamed from: b */
    private static final C58528ij f96562b = C58528ij.m90011K(C65753ak.PKG, C65753ak.ASSISTANT_HISTORY);

    /* renamed from: c */
    private final ConcurrentMap f96563c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Executor f96564d;

    /* renamed from: e */
    private final C37068d f96565e;

    public C37072b(Executor executor, C37068d dVar) {
        this.f96564d = executor;
        this.f96565e = dVar;
    }

    /* renamed from: a */
    public final synchronized void mo40604a(C36908b bVar, C65753ak akVar, Runnable runnable) {
        this.f96563c.putIfAbsent(akVar, new ConcurrentHashMap());
        ((ConcurrentMap) this.f96563c.get(akVar)).put(bVar, runnable);
    }

    /* renamed from: b */
    public final synchronized void mo40605b(C36908b bVar, C65753ak akVar) {
        ((ConcurrentMap) ConcurrentMap.EL.getOrDefault(this.f96563c, akVar, new ConcurrentHashMap())).remove(bVar);
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (f96562b.contains(akVar)) {
            C37068d dVar = this.f96565e;
            C37065a aVar = (C37065a) C37066b.f96554c.createBuilder();
            aVar.copyOnWrite();
            C37066b bVar = (C37066b) aVar.instance;
            bVar.f96557b = akVar.f178757bE;
            bVar.f96556a |= 1;
            C60856cj.m92911t(C70876o.m103760a(dVar.f189039a.mo39510a(C37071g.m65836b(), dVar.f189040b), (C37066b) aVar.build()), C47810es.m84974n(new C37064a()), this.f96564d);
        }
        if (this.f96563c.containsKey(akVar)) {
            for (Runnable run : ((java.util.concurrent.ConcurrentMap) this.f96563c.get(akVar)).values()) {
                run.run();
            }
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}

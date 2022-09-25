package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.frameworks.client.data.android.p4641h.C61485f;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import java.util.UUID;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.o */
/* compiled from: PG */
public final class C134226o {

    /* renamed from: a */
    public final C134216e f365686a;

    /* renamed from: b */
    public final C61485f f365687b;

    public C134226o(C134217f fVar, UUID uuid, boolean z, C57259bn bnVar) {
        C134216e a = fVar.mo111650a(uuid, z, bnVar);
        this.f365686a = a;
        this.f365687b = new C134213b(a);
    }

    /* renamed from: a */
    public final void mo111656a(Throwable th) {
        C134216e eVar = this.f365686a;
        eVar.f365593a.mo111617c(eVar.f365594b, Status.m102100d(th).getCode());
    }
}

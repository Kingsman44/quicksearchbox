package com.google.frameworks.client.data.android.server;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70898m;

/* renamed from: com.google.frameworks.client.data.android.server.e */
/* compiled from: PG */
final class C61557e implements C70705ej {

    /* renamed from: a */
    private final C70851i f166371a;

    /* renamed from: b */
    private final C61536a f166372b;

    public C61557e(C61536a aVar, C70851i iVar) {
        this.f166372b = aVar;
        this.f166371a = iVar;
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C70898m a = this.f166372b.f166334a.mo39510a(eiVar.mo61741c(), this.f166371a);
        C61556d dVar = new C61556d(eiVar, a);
        a.mo27478a(dVar.f166370b, deVar);
        eiVar.mo62062g(1);
        a.mo27482g(1);
        return dVar.f166369a;
    }
}

package com.google.android.libraries.search.assistant.p2703l;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;

/* renamed from: com.google.android.libraries.search.assistant.l.p */
/* compiled from: PG */
final class C34802p implements C70705ej {

    /* renamed from: a */
    final /* synthetic */ C34798l f92332a;

    public C34802p(C34798l lVar) {
        this.f92332a = lVar;
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C34793g gVar = (C34793g) deVar.mo62027b(C34805s.f92336a);
        if (gVar == null) {
            eiVar.mo39476a(C34803q.f92333a, new C70334de());
            return new C34800n();
        }
        C34797k kVar = (C34797k) this.f92332a.f92329a.get(gVar.f92322a);
        if (kVar != null) {
            return kVar.mo39514a(eiVar, deVar);
        }
        eiVar.mo39476a(C34803q.f92334b, new C70334de());
        return new C34801o();
    }
}

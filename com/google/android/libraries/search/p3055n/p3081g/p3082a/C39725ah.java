package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.search.p3055n.p3085h.C39773f;
import com.google.android.libraries.search.p3055n.p3086i.C39786h;
import com.google.android.libraries.search.p3055n.p3086i.C39787i;
import com.google.android.libraries.search.p3055n.p3086i.C39794p;
import com.google.android.libraries.search.p3055n.p3086i.C39795q;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.g.a.ah */
/* compiled from: PG */
final class C39725ah implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C39726ai f104536a;

    public C39725ah(C39726ai aiVar) {
        this.f104536a = aiVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C39727aj.f104539a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaResourceManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(53844)).mo56386p("Unable to persist data");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu<C39773f> guVar = (C58485gu) obj;
        C59104x b = C39727aj.f104539a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaResourceManager");
        ((C59052c) ((C59052c) b).mo56372aa(53845)).mo56386p("Returning ResourceResponse.");
        C70862aj ajVar = this.f104536a.f104537a;
        C39786h hVar = (C39786h) C39787i.f104645a.createBuilder();
        C62940bt btVar = C39795q.f104653d;
        C39794p pVar = (C39794p) C39795q.f104652c.createBuilder();
        pVar.copyOnWrite();
        C39795q qVar = (C39795q) pVar.instance;
        C62961ch chVar = qVar.f104655a;
        if (!chVar.mo58948c()) {
            qVar.f104655a = C62942bv.mutableCopy(chVar);
        }
        for (C39773f fVar : guVar) {
            qVar.f104655a.mo58916g(fVar.f104620g);
        }
        hVar.mo58885m(btVar, (C39795q) pVar.build());
        ajVar.mo20123c((C39787i) hVar.build());
        this.f104536a.f104537a.mo20121a();
    }
}

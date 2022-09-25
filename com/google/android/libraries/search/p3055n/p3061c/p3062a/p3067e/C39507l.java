package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e;

import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.c.a.e.l */
/* compiled from: PG */
public final class C39507l extends C39502g {

    /* renamed from: a */
    private final C89994f f104036a;

    public C39507l(C89994f fVar) {
        this.f104036a = fVar;
    }

    /* renamed from: b */
    public final void mo41864b(C39514s sVar, C70862aj ajVar) {
        this.f104036a.mo83813b(sVar.f104046b);
        C39513r rVar = sVar.f104047c;
        if (rVar == null) {
            rVar = C39513r.f104037e;
        }
        C89994f fVar = this.f104036a;
        int i = rVar.f104040b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        fVar.mo83814c(C39512q.m68937a(i2), rVar.f104042d, rVar.f104041c);
        C39515t tVar = (C39515t) C39516u.f104048d.createBuilder();
        tVar.copyOnWrite();
        C39516u uVar = (C39516u) tVar.instance;
        uVar.f104050a |= 1;
        uVar.f104051b = true;
        tVar.copyOnWrite();
        C39516u uVar2 = (C39516u) tVar.instance;
        uVar2.f104050a |= 2;
        uVar2.f104052c = true;
        ajVar.mo20123c((C39516u) tVar.build());
        ajVar.mo20121a();
    }

    /* renamed from: c */
    public final void mo41865c(C70862aj ajVar) {
        C39498c cVar = (C39498c) C39499d.f104022e.createBuilder();
        boolean k = this.f104036a.mo83822k();
        cVar.copyOnWrite();
        C39499d dVar = (C39499d) cVar.instance;
        boolean z = true;
        dVar.f104024a |= 1;
        dVar.f104025b = k;
        boolean l = this.f104036a.mo83823l();
        cVar.copyOnWrite();
        C39499d dVar2 = (C39499d) cVar.instance;
        dVar2.f104024a |= 2;
        dVar2.f104026c = l;
        C89994f fVar = this.f104036a;
        if (fVar.mo83841D(fVar.mo83882ab()) == null) {
            z = false;
        }
        cVar.copyOnWrite();
        C39499d dVar3 = (C39499d) cVar.instance;
        dVar3.f104024a |= 4;
        dVar3.f104027d = z;
        ajVar.mo20123c((C39499d) cVar.build());
        ajVar.mo20121a();
    }
}

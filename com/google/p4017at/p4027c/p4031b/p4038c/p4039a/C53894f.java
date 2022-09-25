package com.google.p4017at.p4027c.p4031b.p4038c.p4039a;

import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.at.c.b.c.a.f */
/* compiled from: PG */
public final class C53894f extends C70864c {
    public C53894f(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C53894f(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo54043b(C53890b bVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C53895g.f141425a;
        if (diVar == null) {
            synchronized (C53895g.class) {
                diVar = C53895g.f141425a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.discover.discofeed.reactions.v1.DiscoverReactions", "CreateReaction");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53890b.f141419c);
                    d.f187486b = C70850d.m103697c(C53892d.f141423a);
                    diVar = d.mo62040a();
                    C53895g.f141425a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), bVar);
    }
}

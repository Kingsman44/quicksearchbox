package com.google.p4017at.p4027c.p4028a.p4029a;

import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.at.c.a.a.l */
/* compiled from: PG */
public final class C53852l extends C70864c {
    public C53852l(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C53852l(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo54032b(C57303dd ddVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C53853m.f141340a;
        if (diVar == null) {
            synchronized (C53853m.class) {
                diVar = C53853m.f141340a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.discover.channels.v1.DiscoverChannelsRenderer", "ListContents");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C57303dd.f152957d);
                    d.f187486b = C70850d.m103697c(C57309dj.f152970a);
                    diVar = d.mo62040a();
                    C53853m.f141340a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), ddVar);
    }
}

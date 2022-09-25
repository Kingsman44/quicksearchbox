package com.google.protos.p5129p.p5131b;

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

/* renamed from: com.google.protos.p.b.bs */
/* compiled from: PG */
public final class C65788bs extends C70864c {
    public C65788bs(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C65788bs(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo59428b(C65811co coVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C65789bt.f178838a;
        if (diVar == null) {
            synchronized (C65789bt.class) {
                diVar = C65789bt.f178838a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("geller.oneplatform.GellerService", "Sync");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C65811co.f178905g);
                    d.f187486b = C70850d.m103697c(C65819cw.f178926i);
                    diVar = d.mo62040a();
                    C65789bt.f178838a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), coVar);
    }
}

package com.google.p427am.p432b.p433a;

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

/* renamed from: com.google.am.b.a.b */
/* compiled from: PG */
public final class C8648b extends C70864c {
    public C8648b(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C8648b(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo17208b(C8666br brVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C8673c.f29988b;
        if (diVar == null) {
            synchronized (C8673c.class) {
                diVar = C8673c.f29988b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.home.foyer.v1.AssistantFamilyService", "UpdateAccountCustodioInfo");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8666br.f29976b);
                    d.f187486b = C70850d.m103697c(C8668bt.f29979a);
                    diVar = d.mo62040a();
                    C8673c.f29988b = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), brVar);
    }
}

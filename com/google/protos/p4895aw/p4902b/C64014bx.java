package com.google.protos.p4895aw.p4902b;

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

/* renamed from: com.google.protos.aw.b.bx */
/* compiled from: PG */
public final class C64014bx extends C70864c {
    public C64014bx(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C64014bx(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo59248b(C64002bl blVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C64015by.f173103a;
        if (diVar == null) {
            synchronized (C64015by.class) {
                diVar = C64015by.f173103a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("search.mdh.MobileDataHubCore", "GetChanges");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C64002bl.f173078f);
                    d.f187486b = C70850d.m103697c(C64006bp.f173086e);
                    diVar = d.mo62040a();
                    C64015by.f173103a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), blVar);
    }

    /* renamed from: c */
    public final C60870cx mo59249c(C64081ej ejVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C64015by.f173104b;
        if (diVar == null) {
            synchronized (C64015by.class) {
                diVar = C64015by.f173104b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("search.mdh.MobileDataHubCore", "UploadChanges");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C64081ej.f173236h);
                    d.f187486b = C70850d.m103697c(C64087ep.f173258e);
                    diVar = d.mo62040a();
                    C64015by.f173104b = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), ejVar);
    }
}

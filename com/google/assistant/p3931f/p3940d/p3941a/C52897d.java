package com.google.assistant.p3931f.p3940d.p3941a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.assistant.f.d.a.d */
/* compiled from: PG */
public final class C52897d extends C70852a {
    public C52897d(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C52897d(jVar, iVar);
    }

    /* renamed from: b */
    public final C70862aj mo53946b(C70862aj ajVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C52898e.f138736b;
        if (diVar == null) {
            synchronized (C52898e.class) {
                diVar = C52898e.f138736b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.assistant.appactions.service.proto.AppActionsService", "RequestFulfillment");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C52862al.f138692c);
                    d.f187486b = C70850d.m103697c(C52864an.f138696g);
                    diVar = d.mo62040a();
                    C52898e.f138736b = diVar;
                }
            }
        }
        return C70876o.m103761b(jVar.mo39510a(diVar, this.f189040b), ajVar, true);
    }
}

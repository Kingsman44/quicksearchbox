package com.google.protos.p5129p.p5130a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.protos.p.a.n */
/* compiled from: PG */
public final class C65729n {

    /* renamed from: a */
    private static volatile C70338di f178567a;

    /* renamed from: b */
    private static volatile C70716eu f178568b;

    private C65729n() {
    }

    /* renamed from: a */
    public static C70338di m96791a() {
        C70338di diVar = f178567a;
        if (diVar == null) {
            synchronized (C65729n.class) {
                diVar = f178567a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("geller.client.GellerInterprocessService", "WriteToGellerStorage");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C65708ag.f178520d);
                    d.f187486b = C70850d.m103697c(C65710ai.f178526b);
                    diVar = d.mo62040a();
                    f178567a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m96792b() {
        C70716eu euVar = f178568b;
        if (euVar == null) {
            synchronized (C65729n.class) {
                euVar = f178568b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("geller.client.GellerInterprocessService");
                    etVar.mo62433a(m96791a());
                    euVar = new C70716eu(etVar);
                    f178568b = euVar;
                }
            }
        }
        return euVar;
    }
}

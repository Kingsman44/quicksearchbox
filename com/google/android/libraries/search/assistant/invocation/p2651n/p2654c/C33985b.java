package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.b */
/* compiled from: PG */
public final class C33985b {

    /* renamed from: a */
    private static volatile C70338di f90610a;

    /* renamed from: b */
    private static volatile C70716eu f90611b;

    private C33985b() {
    }

    /* renamed from: a */
    public static C70338di m62651a() {
        C70338di diVar = f90610a;
        if (diVar == null) {
            synchronized (C33985b.class) {
                diVar = f90610a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.systemui.service.ApaSystemUiService", "SetUiHints");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34000q.f90628b);
                    d.f187486b = C70850d.m103697c(C34002s.f90631c);
                    diVar = d.mo62040a();
                    f90610a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m62652b() {
        C70716eu euVar = f90611b;
        if (euVar == null) {
            synchronized (C33985b.class) {
                euVar = f90611b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.invocation.systemui.service.ApaSystemUiService");
                    etVar.mo62433a(m62651a());
                    euVar = new C70716eu(etVar);
                    f90611b = euVar;
                }
            }
        }
        return euVar;
    }
}

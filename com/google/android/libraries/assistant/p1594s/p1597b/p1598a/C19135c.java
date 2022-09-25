package com.google.android.libraries.assistant.p1594s.p1597b.p1598a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.s.b.a.c */
/* compiled from: PG */
public final class C19135c {

    /* renamed from: a */
    private static volatile C70338di f53605a;

    /* renamed from: b */
    private static volatile C70716eu f53606b;

    private C19135c() {
    }

    /* renamed from: a */
    public static C70338di m36550a() {
        C70338di diVar = f53605a;
        if (diVar == null) {
            synchronized (C19135c.class) {
                diVar = f53605a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.DebugInfoService", "GetDebugInfos");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19137e.f53607a);
                    d.f187486b = C70850d.m103697c(C19139g.f53609b);
                    diVar = d.mo62040a();
                    f53605a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m36551b() {
        C70716eu euVar = f53606b;
        if (euVar == null) {
            synchronized (C19135c.class) {
                euVar = f53606b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.assistant.tapas.DebugInfoService");
                    etVar.mo62433a(m36550a());
                    euVar = new C70716eu(etVar);
                    f53606b = euVar;
                }
            }
        }
        return euVar;
    }
}

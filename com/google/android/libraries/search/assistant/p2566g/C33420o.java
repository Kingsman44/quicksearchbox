package com.google.android.libraries.search.assistant.p2566g;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.libraries.search.assistant.g.o */
/* compiled from: PG */
public final class C33420o {

    /* renamed from: a */
    private static volatile C70338di f89500a;

    /* renamed from: b */
    private static volatile C70716eu f89501b;

    private C33420o() {
    }

    /* renamed from: a */
    public static C33417l m62005a(C70888j jVar) {
        return (C33417l) C70864c.m103731e(new C33416k(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m62006b() {
        C70338di diVar = f89500a;
        if (diVar == null) {
            synchronized (C33420o.class) {
                diVar = f89500a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.contextdebug.ContextDebugDataFetcher", "FetchDebugData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33430y.f89529d);
                    d.f187486b = C70850d.m103697c(C33406aa.f89467c);
                    diVar = d.mo62040a();
                    f89500a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m62007c() {
        C70716eu euVar = f89501b;
        if (euVar == null) {
            synchronized (C33420o.class) {
                euVar = f89501b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.contextdebug.ContextDebugDataFetcher");
                    etVar.mo62433a(m62006b());
                    euVar = new C70716eu(etVar);
                    f89501b = euVar;
                }
            }
        }
        return euVar;
    }
}

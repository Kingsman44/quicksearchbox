package com.google.assistant.p4003x.p4004a.p4005a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.assistant.x.a.a.f */
/* compiled from: PG */
public final class C53516f {

    /* renamed from: a */
    private static volatile C70338di f140454a;

    /* renamed from: b */
    private static volatile C70716eu f140455b;

    private C53516f() {
    }

    /* renamed from: a */
    public static C53515e m86841a(C70888j jVar) {
        return (C53515e) C70864c.m103731e(new C53514d(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m86842b() {
        C70338di diVar = f140454a;
        if (diVar == null) {
            synchronized (C53516f.class) {
                diVar = f140454a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.frontend.v1.YoutubeAssistantFrontendProxyService", "GetYoutubeAssistantAction");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53520j.f140460a);
                    d.f187486b = C70850d.m103697c(C53522l.f140462a);
                    diVar = d.mo62040a();
                    f140454a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m86843c() {
        C70716eu euVar = f140455b;
        if (euVar == null) {
            synchronized (C53516f.class) {
                euVar = f140455b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.frontend.v1.YoutubeAssistantFrontendProxyService");
                    etVar.mo62433a(m86842b());
                    euVar = new C70716eu(etVar);
                    f140455b = euVar;
                }
            }
        }
        return euVar;
    }
}

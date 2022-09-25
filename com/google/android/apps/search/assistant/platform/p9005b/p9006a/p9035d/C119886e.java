package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.e */
/* compiled from: PG */
public final class C119886e {

    /* renamed from: a */
    private static volatile C70338di f333872a;

    /* renamed from: b */
    private static volatile C70716eu f333873b;

    private C119886e() {
    }

    /* renamed from: a */
    public static C70338di m198759a() {
        C70338di diVar = f333872a;
        if (diVar == null) {
            synchronized (C119886e.class) {
                diVar = f333872a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.conversation.api.proto.ApaClientController", "Connect");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119804az.f333703c);
                    d.f187486b = C70850d.m103697c(C119874do.f333841c);
                    diVar = d.mo62040a();
                    f333872a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m198760b() {
        C70716eu euVar = f333873b;
        if (euVar == null) {
            synchronized (C119886e.class) {
                euVar = f333873b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.platform.conversation.api.proto.ApaClientController");
                    etVar.mo62433a(m198759a());
                    euVar = new C70716eu(etVar);
                    f333873b = euVar;
                }
            }
        }
        return euVar;
    }
}

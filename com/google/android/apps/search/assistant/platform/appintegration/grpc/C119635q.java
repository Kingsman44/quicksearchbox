package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.q */
/* compiled from: PG */
public final class C119635q {

    /* renamed from: a */
    private static volatile C70338di f333399a;

    /* renamed from: b */
    private static volatile C70716eu f333400b;

    private C119635q() {
    }

    /* renamed from: a */
    public static C70338di m198557a() {
        C70338di diVar = f333399a;
        if (diVar == null) {
            synchronized (C119635q.class) {
                diVar = f333399a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.appintegration.grpc.AssistantAppIntegrationService", "StartAssistantSession");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119623e.f333371e);
                    d.f187486b = C70850d.m103697c(C119627i.f333384i);
                    diVar = d.mo62040a();
                    f333399a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m198558b() {
        C70716eu euVar = f333400b;
        if (euVar == null) {
            synchronized (C119635q.class) {
                euVar = f333400b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.appintegration.grpc.AssistantAppIntegrationService");
                    etVar.mo62433a(m198557a());
                    euVar = new C70716eu(etVar);
                    f333400b = euVar;
                }
            }
        }
        return euVar;
    }
}

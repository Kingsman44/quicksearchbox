package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.z */
/* compiled from: PG */
public final class C120080z {

    /* renamed from: a */
    public static volatile C70716eu f334282a;

    /* renamed from: b */
    private static volatile C70338di f334283b;

    private C120080z() {
    }

    /* renamed from: a */
    public static C70338di m199004a() {
        C70338di diVar = f334283b;
        if (diVar == null) {
            synchronized (C120080z.class) {
                diVar = f334283b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityService", "Subscribe");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C120047ai.f334213b);
                    d.f187486b = C70850d.m103697c(C120054ap.f334221c);
                    diVar = d.mo62040a();
                    f334283b = diVar;
                }
            }
        }
        return diVar;
    }
}

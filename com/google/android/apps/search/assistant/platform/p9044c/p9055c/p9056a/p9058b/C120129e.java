package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.e */
/* compiled from: PG */
public final class C120129e {

    /* renamed from: a */
    public static volatile C70716eu f334366a;

    /* renamed from: b */
    private static volatile C70338di f334367b;

    private C120129e() {
    }

    /* renamed from: a */
    public static C70338di m199069a() {
        C70338di diVar = f334367b;
        if (diVar == null) {
            synchronized (C120129e.class) {
                diVar = f334367b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.invocation.triggering.migration.surfaces.LegacySpecialAssistantExperienceService", "OnActive");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C120141q.f334384c);
                    d.f187486b = C70850d.m103697c(C120137m.f334377a);
                    diVar = d.mo62040a();
                    f334367b = diVar;
                }
            }
        }
        return diVar;
    }
}

package com.google.android.libraries.assistant.p1467d.p1472c.p1474b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.d.c.b.e */
/* compiled from: PG */
public final class C17865e {

    /* renamed from: a */
    public static volatile C70716eu f51194a;

    /* renamed from: b */
    private static volatile C70338di f51195b;

    private C17865e() {
    }

    /* renamed from: a */
    public static C70338di m35105a() {
        C70338di diVar = f51195b;
        if (diVar == null) {
            synchronized (C17865e.class) {
                diVar = f51195b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationService", "StartSession");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17867g.f51196f);
                    d.f187486b = C70850d.m103697c(C17869i.f51204c);
                    diVar = d.mo62040a();
                    f51195b = diVar;
                }
            }
        }
        return diVar;
    }
}

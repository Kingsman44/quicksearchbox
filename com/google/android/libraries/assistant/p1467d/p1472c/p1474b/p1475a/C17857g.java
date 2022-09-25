package com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.d.c.b.a.g */
/* compiled from: PG */
public final class C17857g {

    /* renamed from: a */
    public static volatile C70716eu f51183a;

    /* renamed from: b */
    private static volatile C70338di f51184b;

    /* renamed from: c */
    private static volatile C70338di f51185c;

    private C17857g() {
    }

    /* renamed from: a */
    public static C70338di m35098a() {
        C70338di diVar = f51184b;
        if (diVar == null) {
            synchronized (C17857g.class) {
                diVar = f51184b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.CLIENT_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.appintegration.shared.grpc.callback.AppIntegrationCallbackService", "Connect");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17859i.f51186c);
                    d.f187486b = C70850d.m103697c(C17861k.f51191a);
                    diVar = d.mo62040a();
                    f51184b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m35099b() {
        C70338di diVar = f51185c;
        if (diVar == null) {
            synchronized (C17857g.class) {
                diVar = f51185c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.appintegration.shared.grpc.callback.AppIntegrationCallbackService", "SendEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17859i.f51186c);
                    d.f187486b = C70850d.m103697c(C17861k.f51191a);
                    diVar = d.mo62040a();
                    f51185c = diVar;
                }
            }
        }
        return diVar;
    }
}

package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.n.c.a.e.i */
/* compiled from: PG */
public final class C39504i {

    /* renamed from: a */
    public static volatile C70716eu f104030a;

    /* renamed from: b */
    private static volatile C70338di f104031b;

    /* renamed from: c */
    private static volatile C70338di f104032c;

    private C39504i() {
    }

    /* renamed from: a */
    public static C70338di m68926a() {
        C70338di diVar = f104032c;
        if (diVar == null) {
            synchronized (C39504i.class) {
                diVar = f104032c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.soda.hotworddetection.impl.hotwordservice.HotwordService", "GetHotwordConfig");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C39497b.f104020a);
                    d.f187486b = C70850d.m103697c(C39499d.f104022e);
                    diVar = d.mo62040a();
                    f104032c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m68927b() {
        C70338di diVar = f104031b;
        if (diVar == null) {
            synchronized (C39504i.class) {
                diVar = f104031b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.soda.hotworddetection.impl.hotwordservice.HotwordService", "SendDspData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C39514s.f104043d);
                    d.f187486b = C70850d.m103697c(C39516u.f104048d);
                    diVar = d.mo62040a();
                    f104031b = diVar;
                }
            }
        }
        return diVar;
    }
}

package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.n.c.a.i.e */
/* compiled from: PG */
public final class C39613e {

    /* renamed from: a */
    public static volatile C70716eu f104280a;

    /* renamed from: b */
    private static volatile C70338di f104281b;

    private C39613e() {
    }

    /* renamed from: a */
    public static C70338di m69068a() {
        C70338di diVar = f104281b;
        if (diVar == null) {
            synchronized (C39613e.class) {
                diVar = f104281b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.soda.hotworddetection.impl.sodatriggeringfrontendservice.SodaTriggeringFrontendService", "Notify");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C39618j.f104289c);
                    d.f187486b = C70850d.m103697c(C39620l.f104294a);
                    diVar = d.mo62040a();
                    f104281b = diVar;
                }
            }
        }
        return diVar;
    }
}

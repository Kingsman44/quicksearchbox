package com.google.android.libraries.search.p3055n.p3086i;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.n.i.n */
/* compiled from: PG */
public final class C39792n {

    /* renamed from: a */
    public static volatile C70716eu f104649a;

    /* renamed from: b */
    private static volatile C70338di f104650b;

    private C39792n() {
    }

    /* renamed from: a */
    public static C70338di m69207a() {
        C70338di diVar = f104650b;
        if (diVar == null) {
            synchronized (C39792n.class) {
                diVar = f104650b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.soda.services.SodaResourceManagerService", "Session");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C39785g.f104642a);
                    d.f187486b = C70850d.m103697c(C39787i.f104645a);
                    diVar = d.mo62040a();
                    f104650b = diVar;
                }
            }
        }
        return diVar;
    }
}

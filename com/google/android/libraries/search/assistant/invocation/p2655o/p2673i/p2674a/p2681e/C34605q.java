package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e.q */
/* compiled from: PG */
public final class C34605q {

    /* renamed from: a */
    public static volatile C70716eu f91918a;

    /* renamed from: b */
    private static volatile C70338di f91919b;

    private C34605q() {
    }

    /* renamed from: a */
    public static C70338di m63336a() {
        C70338di diVar = f91919b;
        if (diVar == null) {
            synchronized (C34605q.class) {
                diVar = f91919b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.external.ExternalHotwordVerificationService", "Verify");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34590b.f91893c);
                    d.f187486b = C70850d.m103697c(C34592d.f91897b);
                    diVar = d.mo62040a();
                    f91919b = diVar;
                }
            }
        }
        return diVar;
    }
}

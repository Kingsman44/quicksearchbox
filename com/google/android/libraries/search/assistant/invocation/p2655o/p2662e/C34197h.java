package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.h */
/* compiled from: PG */
public final class C34197h {

    /* renamed from: a */
    public static volatile C70716eu f91018a;

    /* renamed from: b */
    private static volatile C70338di f91019b;

    private C34197h() {
    }

    /* renamed from: a */
    public static C70338di m62820a() {
        C70338di diVar = f91019b;
        if (diVar == null) {
            synchronized (C34197h.class) {
                diVar = f91019b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.triggering.oracle.InvocationOracleService", "OnPreferredClientMappingChanged");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34193d.f91011a);
                    d.f187486b = C70850d.m103697c(C34196g.f91014b);
                    diVar = d.mo62040a();
                    f91019b = diVar;
                }
            }
        }
        return diVar;
    }
}

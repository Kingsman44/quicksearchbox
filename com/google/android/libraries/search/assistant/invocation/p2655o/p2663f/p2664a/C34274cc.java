package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.cc */
/* compiled from: PG */
public final class C34274cc {

    /* renamed from: a */
    public static volatile C70716eu f91172a;

    /* renamed from: b */
    private static volatile C70338di f91173b;

    private C34274cc() {
    }

    /* renamed from: a */
    public static C70338di m62929a() {
        C70338di diVar = f91173b;
        if (diVar == null) {
            synchronized (C34274cc.class) {
                diVar = f91173b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateService", "OnObserve");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34313w.f91242e);
                    d.f187486b = C70850d.m103697c(C34315y.f91249a);
                    diVar = d.mo62040a();
                    f91173b = diVar;
                }
            }
        }
        return diVar;
    }
}

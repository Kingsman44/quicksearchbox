package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.w */
/* compiled from: PG */
public final class C34633w {

    /* renamed from: a */
    public static volatile C70716eu f91966a;

    /* renamed from: b */
    private static volatile C70338di f91967b;

    private C34633w() {
    }

    /* renamed from: a */
    public static C70338di m63360a() {
        C70338di diVar = f91967b;
        if (diVar == null) {
            synchronized (C34633w.class) {
                diVar = f91967b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.suppression.HotwordSuppressionService", "Suppress");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34613c.f91928d);
                    d.f187486b = C70850d.m103697c(C34615e.f91933a);
                    diVar = d.mo62040a();
                    f91967b = diVar;
                }
            }
        }
        return diVar;
    }
}

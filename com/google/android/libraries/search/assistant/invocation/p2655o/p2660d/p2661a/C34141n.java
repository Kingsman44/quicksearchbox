package com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.d.a.n */
/* compiled from: PG */
public final class C34141n {

    /* renamed from: a */
    public static volatile C70716eu f90902a;

    /* renamed from: b */
    private static volatile C70338di f90903b;

    private C34141n() {
    }

    /* renamed from: a */
    public static C70338di m62758a() {
        C70338di diVar = f90903b;
        if (diVar == null) {
            synchronized (C34141n.class) {
                diVar = f90903b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.triggering.hotword.architecture.HotwordArchitectureAccessorService", "GetHotwordArchitecture");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34150w.f90916a);
                    d.f187486b = C70850d.m103697c(C34153z.f90924b);
                    diVar = d.mo62040a();
                    f90903b = diVar;
                }
            }
        }
        return diVar;
    }
}

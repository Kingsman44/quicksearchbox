package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.a */
/* compiled from: PG */
public final class C33895a {

    /* renamed from: a */
    public static volatile C70716eu f90431a;

    /* renamed from: b */
    private static volatile C70338di f90432b;

    private C33895a() {
    }

    /* renamed from: a */
    public static C70338di m62551a() {
        C70338di diVar = f90432b;
        if (diVar == null) {
            synchronized (C33895a.class) {
                diVar = f90432b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.lifecycle.service.ApaLifecycleApiService", "UpdateState");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33906l.f90449c);
                    d.f187486b = C70850d.m103697c(C33908n.f90454c);
                    diVar = d.mo62040a();
                    f90432b = diVar;
                }
            }
        }
        return diVar;
    }
}

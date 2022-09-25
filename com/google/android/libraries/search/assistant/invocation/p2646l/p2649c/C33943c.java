package com.google.android.libraries.search.assistant.invocation.p2646l.p2649c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.c.c */
/* compiled from: PG */
public final class C33943c {

    /* renamed from: a */
    public static volatile C70716eu f90516a;

    /* renamed from: b */
    private static volatile C70338di f90517b;

    private C33943c() {
    }

    /* renamed from: a */
    public static C70338di m62593a() {
        C70338di diVar = f90517b;
        if (diVar == null) {
            synchronized (C33943c.class) {
                diVar = f90517b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.mediacontext.service.ApaMediaContextService", "GetMediaContext");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33947g.f90518b);
                    d.f187486b = C70850d.m103697c(C33949i.f90522b);
                    diVar = d.mo62040a();
                    f90517b = diVar;
                }
            }
        }
        return diVar;
    }
}

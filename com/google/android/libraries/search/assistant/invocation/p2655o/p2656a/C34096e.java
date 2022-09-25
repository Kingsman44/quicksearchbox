package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.e */
/* compiled from: PG */
public final class C34096e {

    /* renamed from: a */
    private static volatile C70338di f90833a;

    /* renamed from: b */
    private static volatile C70716eu f90834b;

    private C34096e() {
    }

    /* renamed from: a */
    public static C70338di m62727a() {
        C70338di diVar = f90833a;
        if (diVar == null) {
            synchronized (C34096e.class) {
                diVar = f90833a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.triggering.api.ApaTriggeringService", "Connect");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34117z.f90863d);
                    d.f187486b = C70850d.m103697c(C34076cl.f90797c);
                    diVar = d.mo62040a();
                    f90833a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m62728b() {
        C70716eu euVar = f90834b;
        if (euVar == null) {
            synchronized (C34096e.class) {
                euVar = f90834b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.invocation.triggering.api.ApaTriggeringService");
                    etVar.mo62433a(m62727a());
                    euVar = new C70716eu(etVar);
                    f90834b = euVar;
                }
            }
        }
        return euVar;
    }
}

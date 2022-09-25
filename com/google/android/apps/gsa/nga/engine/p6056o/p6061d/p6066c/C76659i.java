package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6066c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.c.i */
/* compiled from: PG */
public final class C76659i {

    /* renamed from: a */
    private static volatile C70338di f211917a;

    /* renamed from: b */
    private static volatile C70716eu f211918b;

    private C76659i() {
    }

    /* renamed from: a */
    public static C70338di m123270a() {
        C70338di diVar = f211917a;
        if (diVar == null) {
            synchronized (C76659i.class) {
                diVar = f211917a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.gsa.nga.engine.fulfillment.grpc.fluidactions.FluidActionsService", "Fulfill");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C76652b.f211910b);
                    d.f187486b = C70850d.m103697c(C76654d.f211913b);
                    diVar = d.mo62040a();
                    f211917a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m123271b() {
        C70716eu euVar = f211918b;
        if (euVar == null) {
            synchronized (C76659i.class) {
                euVar = f211918b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.gsa.nga.engine.fulfillment.grpc.fluidactions.FluidActionsService");
                    etVar.mo62433a(m123270a());
                    euVar = new C70716eu(etVar);
                    f211918b = euVar;
                }
            }
        }
        return euVar;
    }
}

package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.protobuf.C62916ax;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.c.b.c.ar */
/* compiled from: PG */
public final class C17051ar {

    /* renamed from: a */
    public static volatile C70716eu f49660a;

    /* renamed from: b */
    private static volatile C70338di f49661b;

    private C17051ar() {
    }

    /* renamed from: a */
    public static C70338di m34215a() {
        C70338di diVar = f49661b;
        if (diVar == null) {
            synchronized (C17051ar.class) {
                diVar = f49661b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.apa.datadownload.grpc.LegacyNgaSyncService", "TriggerMddUpdate");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62916ax.f169865a);
                    d.f187486b = C70850d.m103697c(C62916ax.f169865a);
                    diVar = d.mo62040a();
                    f49661b = diVar;
                }
            }
        }
        return diVar;
    }
}

package com.google.android.apps.search.assistant.verticals.automation.routines.p10028d;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.d.k */
/* compiled from: PG */
public final class C131868k {

    /* renamed from: a */
    private static volatile C70338di f360103a;

    /* renamed from: b */
    private static volatile C70338di f360104b;

    /* renamed from: c */
    private static volatile C70716eu f360105c;

    private C131868k() {
    }

    /* renamed from: a */
    public static C131866i m214344a(C70888j jVar) {
        return (C131866i) C70864c.m103731e(new C131864g(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m214345b() {
        C70338di diVar = f360104b;
        if (diVar == null) {
            synchronized (C131868k.class) {
                diVar = f360104b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.routines.RoutinesService", "DeleteGeofence");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C131861d.f360092d);
                    d.f187486b = C70850d.m103697c(C131863f.f360097c);
                    diVar = d.mo62040a();
                    f360104b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m214346c() {
        C70338di diVar = f360103a;
        if (diVar == null) {
            synchronized (C131868k.class) {
                diVar = f360103a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.routines.RoutinesService", "UpdateGeofence");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C131872o.f360114d);
                    d.f187486b = C70850d.m103697c(C131874q.f360119c);
                    diVar = d.mo62040a();
                    f360103a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70716eu m214347d() {
        C70716eu euVar = f360105c;
        if (euVar == null) {
            synchronized (C131868k.class) {
                euVar = f360105c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.routines.RoutinesService");
                    etVar.mo62433a(m214346c());
                    etVar.mo62433a(m214345b());
                    euVar = new C70716eu(etVar);
                    f360105c = euVar;
                }
            }
        }
        return euVar;
    }
}

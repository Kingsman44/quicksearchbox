package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.ae */
/* compiled from: PG */
public final class C121995ae {

    /* renamed from: a */
    private static volatile C70338di f338523a;

    /* renamed from: b */
    private static volatile C70338di f338524b;

    /* renamed from: c */
    private static volatile C70338di f338525c;

    /* renamed from: d */
    private static volatile C70716eu f338526d;

    private C121995ae() {
    }

    /* renamed from: a */
    public static C70338di m201501a() {
        C70338di diVar = f338523a;
        if (diVar == null) {
            synchronized (C121995ae.class) {
                diVar = f338523a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenService", "GetVisToken");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C122021d.f338555a);
                    d.f187486b = C70850d.m103697c(C122023f.f338557a);
                    diVar = d.mo62040a();
                    f338523a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m201502b() {
        C70338di diVar = f338524b;
        if (diVar == null) {
            synchronized (C121995ae.class) {
                diVar = f338524b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenService", "SubscribeToEvents");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C122028k.f338568a);
                    d.f187486b = C70850d.m103697c(C122026i.f338565b);
                    diVar = d.mo62040a();
                    f338524b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m201503c() {
        C70338di diVar = f338525c;
        if (diVar == null) {
            synchronized (C121995ae.class) {
                diVar = f338525c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenService", "SubscribeToStates");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C122033p.f338581a);
                    d.f187486b = C70850d.m103697c(C122031n.f338578b);
                    diVar = d.mo62040a();
                    f338525c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70716eu m201504d() {
        C70716eu euVar = f338526d;
        if (euVar == null) {
            synchronized (C121995ae.class) {
                euVar = f338526d;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenService");
                    etVar.mo62433a(m201501a());
                    etVar.mo62433a(m201502b());
                    etVar.mo62433a(m201503c());
                    euVar = new C70716eu(etVar);
                    f338526d = euVar;
                }
            }
        }
        return euVar;
    }
}

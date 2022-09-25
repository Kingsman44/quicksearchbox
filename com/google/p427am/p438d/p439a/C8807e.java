package com.google.p427am.p438d.p439a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.am.d.a.e */
/* compiled from: PG */
public final class C8807e {

    /* renamed from: a */
    public static volatile C70716eu f30188a;

    /* renamed from: b */
    private static volatile C70338di f30189b;

    /* renamed from: c */
    private static volatile C70338di f30190c;

    /* renamed from: d */
    private static volatile C70338di f30191d;

    /* renamed from: e */
    private static volatile C70338di f30192e;

    private C8807e() {
    }

    /* renamed from: a */
    public static C70338di m23417a() {
        C70338di diVar = f30189b;
        if (diVar == null) {
            synchronized (C8807e.class) {
                diVar = f30189b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.Auth", "AuthReady");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8818l.f30199a);
                    d.f187486b = C70850d.m103697c(C8820n.f30201d);
                    diVar = d.mo62040a();
                    f30189b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m23418b() {
        C70338di diVar = f30190c;
        if (diVar == null) {
            synchronized (C8807e.class) {
                diVar = f30190c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("usonia.ipc.Auth", "AuthReadyStreaming");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8818l.f30199a);
                    d.f187486b = C70850d.m103697c(C8820n.f30201d);
                    diVar = d.mo62040a();
                    f30190c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m23419c() {
        C70338di diVar = f30191d;
        if (diVar == null) {
            synchronized (C8807e.class) {
                diVar = f30191d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.Auth", "Sign");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8769cp.f30131c);
                    d.f187486b = C70850d.m103697c(C8771cr.f30135c);
                    diVar = d.mo62040a();
                    f30191d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m23420d() {
        C70338di diVar = f30192e;
        if (diVar == null) {
            synchronized (C8807e.class) {
                diVar = f30192e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.Auth", "Verify");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8806dz.f30184c);
                    d.f187486b = C70850d.m103697c(C8809eb.f30193d);
                    diVar = d.mo62040a();
                    f30192e = diVar;
                }
            }
        }
        return diVar;
    }
}

package com.google.p427am.p438d.p439a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.am.d.a.w */
/* compiled from: PG */
public final class C8829w {

    /* renamed from: a */
    public static volatile C70716eu f30213a;

    /* renamed from: b */
    private static volatile C70338di f30214b;

    /* renamed from: c */
    private static volatile C70338di f30215c;

    /* renamed from: d */
    private static volatile C70338di f30216d;

    /* renamed from: e */
    private static volatile C70338di f30217e;

    /* renamed from: f */
    private static volatile C70338di f30218f;

    /* renamed from: g */
    private static volatile C70338di f30219g;

    /* renamed from: h */
    private static volatile C70338di f30220h;

    /* renamed from: i */
    private static volatile C70338di f30221i;

    /* renamed from: j */
    private static volatile C70338di f30222j;

    private C8829w() {
    }

    /* renamed from: a */
    public static C70338di m23450a() {
        C70338di diVar = f30217e;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30217e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "AddService");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8726b.f30061b);
                    d.f187486b = C70850d.m103697c(C8780d.f30150a);
                    diVar = d.mo62040a();
                    f30217e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m23451b() {
        C70338di diVar = f30215c;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30215c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "FetchAllPeerAddressList");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8708ai.f30037b);
                    d.f187486b = C70850d.m103697c(C8710ak.f30040b);
                    diVar = d.mo62040a();
                    f30215c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m23452c() {
        C70338di diVar = f30219g;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30219g;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "IsAuthTierMatched");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8713an.f30044a);
                    d.f187486b = C70850d.m103697c(C8715ap.f30046a);
                    diVar = d.mo62040a();
                    f30219g = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m23453d() {
        C70338di diVar = f30222j;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30222j;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "IsIamEnabled");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8717ar.f30048a);
                    d.f187486b = C70850d.m103697c(C8719at.f30050b);
                    diVar = d.mo62040a();
                    f30222j = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m23454e() {
        C70338di diVar = f30220h;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30220h;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "IsPermissionAllowedForSource");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8721av.f30053c);
                    d.f187486b = C70850d.m103697c(C8723ax.f30057b);
                    diVar = d.mo62040a();
                    f30220h = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m23455f() {
        C70338di diVar = f30221i;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30221i;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "IsPermissionAllowedForTarget");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8728bb.f30064c);
                    d.f187486b = C70850d.m103697c(C8730bd.f30068b);
                    diVar = d.mo62040a();
                    f30221i = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: g */
    public static C70338di m23456g() {
        C70338di diVar = f30218f;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30218f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "IsServiceAllowed");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8734bh.f30072c);
                    d.f187486b = C70850d.m103697c(C8736bj.f30076b);
                    diVar = d.mo62040a();
                    f30218f = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: h */
    public static C70338di m23457h() {
        C70338di diVar = f30216d;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30216d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "ResolvePeerAddress");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8754ca.f30107c);
                    d.f187486b = C70850d.m103697c(C8756cc.f30111b);
                    diVar = d.mo62040a();
                    f30216d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: i */
    public static C70338di m23458i() {
        C70338di diVar = f30214b;
        if (diVar == null) {
            synchronized (C8829w.class) {
                diVar = f30214b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("usonia.ipc.DistributedServiceDiscovery", "UpdateObservers");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8785de.f30157c);
                    d.f187486b = C70850d.m103697c(C8790dj.f30166b);
                    diVar = d.mo62040a();
                    f30214b = diVar;
                }
            }
        }
        return diVar;
    }
}

package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.s */
/* compiled from: PG */
public final class C121662s {

    /* renamed from: a */
    private static volatile C70338di f337543a;

    /* renamed from: b */
    private static volatile C70338di f337544b;

    /* renamed from: c */
    private static volatile C70338di f337545c;

    /* renamed from: d */
    private static volatile C70338di f337546d;

    /* renamed from: e */
    private static volatile C70338di f337547e;

    /* renamed from: f */
    private static volatile C70716eu f337548f;

    private C121662s() {
    }

    /* renamed from: a */
    public static C121658o m201040a(C70888j jVar) {
        return (C121658o) C70864c.m103731e(new C121657n(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C121660q m201041b(C70888j jVar) {
        return (C121660q) C70852a.m103707c(new C121656m(), jVar, C70851i.f189015a);
    }

    /* renamed from: c */
    public static C70338di m201042c() {
        C70338di diVar = f337545c;
        if (diVar == null) {
            synchronized (C121662s.class) {
                diVar = f337545c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsService", "GetForegroundActivityId");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121548ab.f337287c);
                    d.f187486b = C70850d.m103697c(C121550ad.f337292b);
                    diVar = d.mo62040a();
                    f337545c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m201043d() {
        C70338di diVar = f337546d;
        if (diVar == null) {
            synchronized (C121662s.class) {
                diVar = f337546d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsService", "OnDirectActionsInvalidated");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121552af.f337295b);
                    d.f187486b = C70850d.m103697c(C121554ah.f337299b);
                    diVar = d.mo62040a();
                    f337546d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70338di m201044e() {
        C70338di diVar = f337547e;
        if (diVar == null) {
            synchronized (C121662s.class) {
                diVar = f337547e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsService", "OnForegroundActivityUpdated");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121556aj.f337302b);
                    d.f187486b = C70850d.m103697c(C121558al.f337306c);
                    diVar = d.mo62040a();
                    f337547e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: f */
    public static C70338di m201045f() {
        C70338di diVar = f337544b;
        if (diVar == null) {
            synchronized (C121662s.class) {
                diVar = f337544b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsService", "PerformDirectAction");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121560an.f337310b);
                    d.f187486b = C70850d.m103697c(C121562ap.f337314a);
                    diVar = d.mo62040a();
                    f337544b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: g */
    public static C70338di m201046g() {
        C70338di diVar = f337543a;
        if (diVar == null) {
            synchronized (C121662s.class) {
                diVar = f337543a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsService", "RequestDirectActions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121564ar.f337316c);
                    d.f187486b = C70850d.m103697c(C121566at.f337321a);
                    diVar = d.mo62040a();
                    f337543a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: h */
    public static C70716eu m201047h() {
        C70716eu euVar = f337548f;
        if (euVar == null) {
            synchronized (C121662s.class) {
                euVar = f337548f;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsService");
                    etVar.mo62433a(m201046g());
                    etVar.mo62433a(m201045f());
                    etVar.mo62433a(m201042c());
                    etVar.mo62433a(m201043d());
                    etVar.mo62433a(m201044e());
                    euVar = new C70716eu(etVar);
                    f337548f = euVar;
                }
            }
        }
        return euVar;
    }
}

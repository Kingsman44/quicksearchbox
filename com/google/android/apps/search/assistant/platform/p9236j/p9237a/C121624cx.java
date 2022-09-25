package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cx */
/* compiled from: PG */
public final class C121624cx {

    /* renamed from: a */
    public static volatile C70716eu f337473a;

    /* renamed from: b */
    private static volatile C70338di f337474b;

    /* renamed from: c */
    private static volatile C70338di f337475c;

    /* renamed from: d */
    private static volatile C70338di f337476d;

    /* renamed from: e */
    private static volatile C70338di f337477e;

    private C121624cx() {
    }

    /* renamed from: a */
    public static C70338di m200961a() {
        C70338di diVar = f337476d;
        if (diVar == null) {
            synchronized (C121624cx.class) {
                diVar = f337476d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsService", "OnDirectActionsInvalidated");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121552af.f337295b);
                    d.f187486b = C70850d.m103697c(C121554ah.f337299b);
                    diVar = d.mo62040a();
                    f337476d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m200962b() {
        C70338di diVar = f337477e;
        if (diVar == null) {
            synchronized (C121624cx.class) {
                diVar = f337477e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsService", "OnForegroundActivityUpdated");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121556aj.f337302b);
                    d.f187486b = C70850d.m103697c(C121558al.f337306c);
                    diVar = d.mo62040a();
                    f337477e = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m200963c() {
        C70338di diVar = f337475c;
        if (diVar == null) {
            synchronized (C121624cx.class) {
                diVar = f337475c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsService", "PerformDirectAction");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121560an.f337310b);
                    d.f187486b = C70850d.m103697c(C121562ap.f337314a);
                    diVar = d.mo62040a();
                    f337475c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m200964d() {
        C70338di diVar = f337474b;
        if (diVar == null) {
            synchronized (C121624cx.class) {
                diVar = f337474b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsService", "RequestDirectActions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121564ar.f337316c);
                    d.f187486b = C70850d.m103697c(C121566at.f337321a);
                    diVar = d.mo62040a();
                    f337474b = diVar;
                }
            }
        }
        return diVar;
    }
}

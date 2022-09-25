package com.google.android.libraries.search.p3055n;

import com.google.speech.p5218j.C67087ko;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.n.cf */
/* compiled from: PG */
public final class C39652cf {

    /* renamed from: a */
    public static volatile C70716eu f104373a;

    /* renamed from: b */
    private static volatile C70338di f104374b;

    /* renamed from: c */
    private static volatile C70338di f104375c;

    /* renamed from: d */
    private static volatile C70338di f104376d;

    private C39652cf() {
    }

    /* renamed from: a */
    public static C70338di m69117a() {
        C70338di diVar = f104375c;
        if (diVar == null) {
            synchronized (C39652cf.class) {
                diVar = f104375c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.soda.SodaAsrFrontendService", "BackgroundBiasingUpdate");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C39670cx.f104424a);
                    d.f187486b = C70850d.m103697c(C67087ko.f182366n);
                    diVar = d.mo62040a();
                    f104375c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m69118b() {
        C70338di diVar = f104376d;
        if (diVar == null) {
            synchronized (C39652cf.class) {
                diVar = f104376d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.soda.SodaAsrFrontendService", "QueryFulfillmentSignal");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C39670cx.f104424a);
                    d.f187486b = C70850d.m103697c(C67087ko.f182366n);
                    diVar = d.mo62040a();
                    f104376d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m69119c() {
        C70338di diVar = f104374b;
        if (diVar == null) {
            synchronized (C39652cf.class) {
                diVar = f104374b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.soda.SodaAsrFrontendService", "Session");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C39670cx.f104424a);
                    d.f187486b = C70850d.m103697c(C67087ko.f182366n);
                    diVar = d.mo62040a();
                    f104374b = diVar;
                }
            }
        }
        return diVar;
    }
}

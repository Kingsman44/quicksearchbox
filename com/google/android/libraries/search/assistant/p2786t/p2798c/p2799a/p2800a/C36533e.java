package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.e */
/* compiled from: PG */
public final class C36533e {

    /* renamed from: a */
    private static volatile C70338di f95308a;

    /* renamed from: b */
    private static volatile C70338di f95309b;

    /* renamed from: c */
    private static volatile C70716eu f95310c;

    private C36533e() {
    }

    /* renamed from: a */
    public static C70338di m65076a() {
        C70338di diVar = f95308a;
        if (diVar == null) {
            synchronized (C36533e.class) {
                diVar = f95308a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.notificationlistener.monitoring.grpc.NotificationEventObserverRegistryService", "RegisterEventObserver");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C36546r.f95329c);
                    d.f187486b = C70850d.m103697c(C36548t.f95333a);
                    diVar = d.mo62040a();
                    f95308a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m65077b() {
        C70338di diVar = f95309b;
        if (diVar == null) {
            synchronized (C36533e.class) {
                diVar = f95309b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.notificationlistener.monitoring.grpc.NotificationEventObserverRegistryService", "UnregisterEventObserver");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C36552x.f95339c);
                    d.f187486b = C70850d.m103697c(C36554z.f95343a);
                    diVar = d.mo62040a();
                    f95309b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m65078c() {
        C70716eu euVar = f95310c;
        if (euVar == null) {
            synchronized (C36533e.class) {
                euVar = f95310c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.assistant.notificationlistener.monitoring.grpc.NotificationEventObserverRegistryService");
                    etVar.mo62433a(m65076a());
                    etVar.mo62433a(m65077b());
                    euVar = new C70716eu(etVar);
                    f95310c = euVar;
                }
            }
        }
        return euVar;
    }
}

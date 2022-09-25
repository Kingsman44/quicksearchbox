package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.j */
/* compiled from: PG */
public final class C36538j {

    /* renamed from: a */
    private static volatile C70338di f95312a;

    /* renamed from: b */
    private static volatile C70716eu f95313b;

    private C36538j() {
    }

    /* renamed from: a */
    public static C70338di m65086a() {
        C70338di diVar = f95312a;
        if (diVar == null) {
            synchronized (C36538j.class) {
                diVar = f95312a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.notificationlistener.monitoring.grpc.NotificationListenerEventProcessorService", "ProcessNotificationListenerEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C36542n.f95319e);
                    d.f187486b = C70850d.m103697c(C36544p.f95325c);
                    diVar = d.mo62040a();
                    f95312a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m65087b() {
        C70716eu euVar = f95313b;
        if (euVar == null) {
            synchronized (C36538j.class) {
                euVar = f95313b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.assistant.notificationlistener.monitoring.grpc.NotificationListenerEventProcessorService");
                    etVar.mo62433a(m65086a());
                    euVar = new C70716eu(etVar);
                    f95313b = euVar;
                }
            }
        }
        return euVar;
    }
}

package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.m */
/* compiled from: PG */
public final class C36419m {

    /* renamed from: a */
    private static volatile C70338di f95104a;

    /* renamed from: b */
    private static volatile C70338di f95105b;

    /* renamed from: c */
    private static volatile C70338di f95106c;

    /* renamed from: d */
    private static volatile C70716eu f95107d;

    private C36419m() {
    }

    /* renamed from: a */
    public static C70338di m64984a() {
        C70338di diVar = f95104a;
        if (diVar == null) {
            synchronized (C36419m.class) {
                diVar = f95104a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.notificationlistener.access.grpc.NotificationAccessorService", "GetActiveNotifications");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C36408b.f95087c);
                    d.f187486b = C70850d.m103697c(C36410d.f95091d);
                    diVar = d.mo62040a();
                    f95104a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m64985b() {
        C70338di diVar = f95106c;
        if (diVar == null) {
            synchronized (C36419m.class) {
                diVar = f95106c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.notificationlistener.access.grpc.NotificationAccessorService", "MarkMessageNotificationAsRead");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C36412f.f95096c);
                    d.f187486b = C70850d.m103697c(C36414h.f95100a);
                    diVar = d.mo62040a();
                    f95106c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m64986c() {
        C70338di diVar = f95105b;
        if (diVar == null) {
            synchronized (C36419m.class) {
                diVar = f95105b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.notificationlistener.access.grpc.NotificationAccessorService", "ReplyToMessageNotification");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C36421o.f95108c);
                    d.f187486b = C70850d.m103697c(C36423q.f95112a);
                    diVar = d.mo62040a();
                    f95105b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70716eu m64987d() {
        C70716eu euVar = f95107d;
        if (euVar == null) {
            synchronized (C36419m.class) {
                euVar = f95107d;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.assistant.notificationlistener.access.grpc.NotificationAccessorService");
                    etVar.mo62433a(m64984a());
                    etVar.mo62433a(m64986c());
                    etVar.mo62433a(m64985b());
                    euVar = new C70716eu(etVar);
                    f95107d = euVar;
                }
            }
        }
        return euVar;
    }
}

package com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.c.a */
/* compiled from: PG */
public final class C120982a {

    /* renamed from: a */
    public static volatile C70716eu f336339a;

    /* renamed from: b */
    private static volatile C70338di f336340b;

    private C120982a() {
    }

    /* renamed from: a */
    public static C70338di m200279a() {
        C70338di diVar = f336340b;
        if (diVar == null) {
            synchronized (C120982a.class) {
                diVar = f336340b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.settingsdata.changenotification.proto.ChangeNotificationListenerService", "OnChange");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C120989h.f336352b);
                    d.f187486b = C70850d.m103697c(C120993l.f336356a);
                    diVar = d.mo62040a();
                    f336340b = diVar;
                }
            }
        }
        return diVar;
    }
}

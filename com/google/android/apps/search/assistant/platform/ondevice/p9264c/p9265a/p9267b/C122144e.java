package com.google.android.apps.search.assistant.platform.ondevice.p9264c.p9265a.p9267b;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.c.a.b.e */
/* compiled from: PG */
public final class C122144e {

    /* renamed from: a */
    public static volatile C70716eu f338813a;

    /* renamed from: b */
    private static volatile C70338di f338814b;

    private C122144e() {
    }

    /* renamed from: a */
    public static C70338di m201687a() {
        C70338di diVar = f338814b;
        if (diVar == null) {
            synchronized (C122144e.class) {
                diVar = f338814b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.ondevice.oneplatform.server.prewarm.PrewarmService", "Prewarm");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f338814b = diVar;
                }
            }
        }
        return diVar;
    }
}

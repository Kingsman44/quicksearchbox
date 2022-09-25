package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9723b;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.b.e */
/* compiled from: PG */
public final class C128466e {

    /* renamed from: a */
    public static volatile C70716eu f353321a;

    /* renamed from: b */
    private static volatile C70338di f353322b;

    private C128466e() {
    }

    /* renamed from: a */
    public static C70338di m209641a() {
        C70338di diVar = f353322b;
        if (diVar == null) {
            synchronized (C128466e.class) {
                diVar = f353322b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("nga_warm_actions.WarmActionsSettingsListenerService", "OnSettingsChanged");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f353322b = diVar;
                }
            }
        }
        return diVar;
    }
}

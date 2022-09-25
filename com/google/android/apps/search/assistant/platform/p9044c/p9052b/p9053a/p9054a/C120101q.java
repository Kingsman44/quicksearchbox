package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.q */
/* compiled from: PG */
public final class C120101q {

    /* renamed from: a */
    public static volatile C70716eu f334324a;

    /* renamed from: b */
    private static volatile C70338di f334325b;

    private C120101q() {
    }

    /* renamed from: a */
    public static C70338di m199028a() {
        C70338di diVar = f334325b;
        if (diVar == null) {
            synchronized (C120101q.class) {
                diVar = f334325b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.invocation.configuration.defaults.agsa.SettingsChangeListenerService", "OnChange");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C120095k.f334312b);
                    d.f187486b = C70850d.m103697c(C120099o.f334316a);
                    diVar = d.mo62040a();
                    f334325b = diVar;
                }
            }
        }
        return diVar;
    }
}

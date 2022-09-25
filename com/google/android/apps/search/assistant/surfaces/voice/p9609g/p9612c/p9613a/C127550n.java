package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.n */
/* compiled from: PG */
public final class C127550n {

    /* renamed from: a */
    private static volatile C70338di f351202a;

    /* renamed from: b */
    private static volatile C70716eu f351203b;

    private C127550n() {
    }

    /* renamed from: a */
    public static C70338di m208527a() {
        C70338di diVar = f351202a;
        if (diVar == null) {
            synchronized (C127550n.class) {
                diVar = f351202a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.api.LifecycleManagerSearchMonitoring", "SearchMonitor");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127560x.f351206a);
                    d.f187486b = C70850d.m103697c(C127544h.f351188a);
                    diVar = d.mo62040a();
                    f351202a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m208528b() {
        C70716eu euVar = f351203b;
        if (euVar == null) {
            synchronized (C127550n.class) {
                euVar = f351203b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.api.LifecycleManagerSearchMonitoring");
                    etVar.mo62433a(m208527a());
                    euVar = new C70716eu(etVar);
                    f351203b = euVar;
                }
            }
        }
        return euVar;
    }
}

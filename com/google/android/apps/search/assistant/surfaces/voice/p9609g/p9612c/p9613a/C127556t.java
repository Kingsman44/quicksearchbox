package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.t */
/* compiled from: PG */
public final class C127556t {

    /* renamed from: a */
    private static volatile C70338di f351204a;

    /* renamed from: b */
    private static volatile C70716eu f351205b;

    private C127556t() {
    }

    /* renamed from: a */
    public static C70338di m208535a() {
        C70338di diVar = f351204a;
        if (diVar == null) {
            synchronized (C127556t.class) {
                diVar = f351204a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.api.LifecycleManagerService", "CloseInvocation");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127538b.f351181b);
                    d.f187486b = C70850d.m103697c(C127542f.f351186a);
                    diVar = d.mo62040a();
                    f351204a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m208536b() {
        C70716eu euVar = f351205b;
        if (euVar == null) {
            synchronized (C127556t.class) {
                euVar = f351205b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.api.LifecycleManagerService");
                    etVar.mo62433a(m208535a());
                    euVar = new C70716eu(etVar);
                    f351205b = euVar;
                }
            }
        }
        return euVar;
    }
}

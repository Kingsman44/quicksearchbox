package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9610a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.a.c */
/* compiled from: PG */
public final class C127528c {

    /* renamed from: a */
    private static volatile C70338di f351165a;

    /* renamed from: b */
    private static volatile C70716eu f351166b;

    private C127528c() {
    }

    /* renamed from: a */
    public static C70338di m208512a() {
        C70338di diVar = f351165a;
        if (diVar == null) {
            synchronized (C127528c.class) {
                diVar = f351165a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.api.EntryPointComponentService", "OnEntryEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127532g.f351167b);
                    d.f187486b = C70850d.m103697c(C127527b.f351163a);
                    diVar = d.mo62040a();
                    f351165a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m208513b() {
        C70716eu euVar = f351166b;
        if (euVar == null) {
            synchronized (C127528c.class) {
                euVar = f351166b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.api.EntryPointComponentService");
                    etVar.mo62433a(m208512a());
                    euVar = new C70716eu(etVar);
                    f351166b = euVar;
                }
            }
        }
        return euVar;
    }
}

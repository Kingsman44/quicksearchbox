package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.a.i */
/* compiled from: PG */
public final class C127622i {

    /* renamed from: a */
    private static volatile C70338di f351346a;

    /* renamed from: b */
    private static volatile C70338di f351347b;

    /* renamed from: c */
    private static volatile C70716eu f351348c;

    private C127622i() {
    }

    /* renamed from: a */
    public static C70338di m208624a() {
        C70338di diVar = f351346a;
        if (diVar == null) {
            synchronized (C127622i.class) {
                diVar = f351346a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.api.TriggeringClientService", "SelfTrigger");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127617d.f351336e);
                    d.f187486b = C70850d.m103697c(C127621h.f351344a);
                    diVar = d.mo62040a();
                    f351346a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m208625b() {
        C70338di diVar = f351347b;
        if (diVar == null) {
            synchronized (C127622i.class) {
                diVar = f351347b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.api.TriggeringClientService", "UpdateConfig");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127630q.f351355b);
                    d.f187486b = C70850d.m103697c(C127634u.f351359b);
                    diVar = d.mo62040a();
                    f351347b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m208626c() {
        C70716eu euVar = f351348c;
        if (euVar == null) {
            synchronized (C127622i.class) {
                euVar = f351348c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.api.TriggeringClientService");
                    etVar.mo62433a(m208624a());
                    etVar.mo62433a(m208625b());
                    euVar = new C70716eu(etVar);
                    f351348c = euVar;
                }
            }
        }
        return euVar;
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.a.p */
/* compiled from: PG */
public final class C127602p {

    /* renamed from: a */
    public static volatile C70716eu f351303a;

    /* renamed from: b */
    private static volatile C70338di f351304b;

    private C127602p() {
    }

    /* renamed from: a */
    public static C70338di m208600a() {
        C70338di diVar = f351304b;
        if (diVar == null) {
            synchronized (C127602p.class) {
                diVar = f351304b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.settings.api.SettingsChangeService", "OnSettingsChange");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127597k.f351297b);
                    d.f187486b = C70850d.m103697c(C127601o.f351301a);
                    diVar = d.mo62040a();
                    f351304b = diVar;
                }
            }
        }
        return diVar;
    }
}

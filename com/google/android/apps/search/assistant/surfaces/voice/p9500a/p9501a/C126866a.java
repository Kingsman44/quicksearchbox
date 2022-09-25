package com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.a.a.a */
/* compiled from: PG */
public final class C126866a {

    /* renamed from: a */
    private static volatile C70338di f349342a;

    /* renamed from: b */
    private static volatile C70716eu f349343b;

    private C126866a() {
    }

    /* renamed from: a */
    public static C70338di m207532a() {
        C70338di diVar = f349342a;
        if (diVar == null) {
            synchronized (C126866a.class) {
                diVar = f349342a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.appactions.api.AppActionsContextService", "FetchContext");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C126876g.f349351b);
                    d.f187486b = C70850d.m103697c(C126878i.f349355a);
                    diVar = d.mo62040a();
                    f349342a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m207533b() {
        C70716eu euVar = f349343b;
        if (euVar == null) {
            synchronized (C126866a.class) {
                euVar = f349343b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.appactions.api.AppActionsContextService");
                    etVar.mo62433a(m207532a());
                    euVar = new C70716eu(etVar);
                    f349343b = euVar;
                }
            }
        }
        return euVar;
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.s */
/* compiled from: PG */
public final class C127101s {

    /* renamed from: a */
    private static volatile C70338di f349980a;

    /* renamed from: b */
    private static volatile C70716eu f349981b;

    private C127101s() {
    }

    /* renamed from: a */
    public static C70338di m207869a() {
        C70338di diVar = f349980a;
        if (diVar == null) {
            synchronized (C127101s.class) {
                diVar = f349980a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.controller.ui.controller.UiControllerService", "EnsureUiVisible");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127084b.f349934c);
                    d.f187486b = C70850d.m103697c(C127086d.f349939c);
                    diVar = d.mo62040a();
                    f349980a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m207870b() {
        C70716eu euVar = f349981b;
        if (euVar == null) {
            synchronized (C127101s.class) {
                euVar = f349981b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.controller.ui.controller.UiControllerService");
                    etVar.mo62433a(m207869a());
                    euVar = new C70716eu(etVar);
                    f349981b = euVar;
                }
            }
        }
        return euVar;
    }
}

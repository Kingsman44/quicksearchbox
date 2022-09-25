package com.google.android.apps.search.assistant.surfaces.voice.growth.p9630b.p9631a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.b.a.e */
/* compiled from: PG */
public final class C127717e {

    /* renamed from: a */
    private static volatile C70338di f351595a;

    /* renamed from: b */
    private static volatile C70716eu f351596b;

    private C127717e() {
    }

    /* renamed from: a */
    public static C70338di m208754a() {
        C70338di diVar = f351595a;
        if (diVar == null) {
            synchronized (C127717e.class) {
                diVar = f351595a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.growth.nudgeui.api.NudgeUiService", "OnNudgeUiRequest");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127713b.f351591a);
                    d.f187486b = C70850d.m103697c(C127716d.f351593a);
                    diVar = d.mo62040a();
                    f351595a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m208755b() {
        C70716eu euVar = f351596b;
        if (euVar == null) {
            synchronized (C127717e.class) {
                euVar = f351596b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.growth.nudgeui.api.NudgeUiService");
                    etVar.mo62433a(m208754a());
                    euVar = new C70716eu(etVar);
                    f351596b = euVar;
                }
            }
        }
        return euVar;
    }
}

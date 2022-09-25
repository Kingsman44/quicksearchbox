package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.bh */
/* compiled from: PG */
public final class C125080bh {

    /* renamed from: a */
    private static volatile C70338di f345069a;

    /* renamed from: b */
    private static volatile C70716eu f345070b;

    private C125080bh() {
    }

    /* renamed from: a */
    public static C70338di m204986a() {
        C70338di diVar = f345069a;
        if (diVar == null) {
            synchronized (C125080bh.class) {
                diVar = f345069a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.InteractorDictationService", "SetDictationEligibility");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125154ea.f345239c);
                    d.f187486b = C70850d.m103697c(C125156ec.f345243a);
                    diVar = d.mo62040a();
                    f345069a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m204987b() {
        C70716eu euVar = f345070b;
        if (euVar == null) {
            synchronized (C125080bh.class) {
                euVar = f345070b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.InteractorDictationService");
                    etVar.mo62433a(m204986a());
                    euVar = new C70716eu(etVar);
                    f345070b = euVar;
                }
            }
        }
        return euVar;
    }
}

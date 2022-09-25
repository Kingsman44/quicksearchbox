package com.google.android.libraries.search.assistant.p2825x.p2827b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.x.b.i */
/* compiled from: PG */
public final class C36829i {

    /* renamed from: a */
    private static volatile C70338di f95978a;

    /* renamed from: b */
    private static volatile C70716eu f95979b;

    private C36829i() {
    }

    /* renamed from: a */
    public static C70338di m65542a() {
        C70338di diVar = f95978a;
        if (diVar == null) {
            synchronized (C36829i.class) {
                diVar = f95978a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.quickphrasesmanager.service.proto.QuickPhrasesManagerService", "FetchQuickPhraseEvents");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C36822b.f95965b);
                    d.f187486b = C70850d.m103697c(C36824d.f95969b);
                    diVar = d.mo62040a();
                    f95978a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m65543b() {
        C70716eu euVar = f95979b;
        if (euVar == null) {
            synchronized (C36829i.class) {
                euVar = f95979b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.quickphrasesmanager.service.proto.QuickPhrasesManagerService");
                    etVar.mo62433a(m65542a());
                    euVar = new C70716eu(etVar);
                    f95979b = euVar;
                }
            }
        }
        return euVar;
    }
}

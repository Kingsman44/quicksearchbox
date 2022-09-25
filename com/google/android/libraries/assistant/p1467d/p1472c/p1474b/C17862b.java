package com.google.android.libraries.assistant.p1467d.p1472c.p1474b;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.d.c.b.b */
/* compiled from: PG */
public class C17862b implements C70298d {
    /* renamed from: b */
    public C70862aj mo23484b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C17865e.f51194a;
        if (euVar == null) {
            synchronized (C17865e.class) {
                euVar = C17865e.f51194a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationService");
                    etVar.mo62433a(C17865e.m35105a());
                    euVar = new C70716eu(etVar);
                    C17865e.f51194a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C17865e.m35105a(), C70861ai.m103722a(new C17864d(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

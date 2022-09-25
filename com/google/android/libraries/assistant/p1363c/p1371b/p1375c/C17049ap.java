package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.b.c.ap */
/* compiled from: PG */
public class C17049ap implements C70298d {
    /* renamed from: b */
    public void mo23174b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C17051ar.f49660a;
        if (euVar == null) {
            synchronized (C17051ar.class) {
                euVar = C17051ar.f49660a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.assistant.apa.datadownload.grpc.LegacyNgaSyncService");
                    etVar.mo62433a(C17051ar.m34215a());
                    euVar = new C70716eu(etVar);
                    C17051ar.f49660a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C17051ar.m34215a(), C70861ai.m103725d(new C17050aq(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

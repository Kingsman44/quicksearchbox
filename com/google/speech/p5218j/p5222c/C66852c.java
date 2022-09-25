package com.google.speech.p5218j.p5222c;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.speech.j.c.c */
/* compiled from: PG */
public class C66852c implements C70298d {
    /* renamed from: b */
    public C70862aj mo24468b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C66854e.f181776a;
        if (euVar == null) {
            synchronized (C66854e.class) {
                euVar = C66854e.f181776a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("speech.soda.grpc.SodaService");
                    etVar.mo62433a(C66854e.m97364a());
                    euVar = new C70716eu(etVar);
                    C66854e.f181776a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C66854e.m97364a(), C70861ai.m103722a(new C66851b(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

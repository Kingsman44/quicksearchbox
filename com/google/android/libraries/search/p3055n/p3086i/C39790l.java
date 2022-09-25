package com.google.android.libraries.search.p3055n.p3086i;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.i.l */
/* compiled from: PG */
public class C39790l implements C70298d {
    /* renamed from: b */
    public C70862aj mo42008b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C39792n.f104649a;
        if (euVar == null) {
            synchronized (C39792n.class) {
                euVar = C39792n.f104649a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.soda.services.SodaResourceManagerService");
                    etVar.mo62433a(C39792n.m69207a());
                    euVar = new C70716eu(etVar);
                    C39792n.f104649a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C39792n.m69207a(), C70861ai.m103722a(new C39789k(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

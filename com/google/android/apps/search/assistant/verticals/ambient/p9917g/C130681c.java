package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.c */
/* compiled from: PG */
public class C130681c implements C70298d {
    /* renamed from: b */
    public void mo109780b(C130685g gVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo109781c(C130689k kVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: d */
    public void mo109782d(C130693o oVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C130683e.f357844a;
        if (euVar == null) {
            synchronized (C130683e.class) {
                euVar = C130683e.f357844a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.ambient.AmbientAssistant");
                    etVar.mo62433a(C130683e.m213079c());
                    etVar.mo62433a(C130683e.m213077a());
                    etVar.mo62433a(C130683e.m213078b());
                    euVar = new C70716eu(etVar);
                    C130683e.f357844a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C130683e.m213079c(), C70861ai.m103725d(new C130682d(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C130683e.m213077a(), C70861ai.m103725d(new C130682d(this, 1)), str, euVar, hashMap);
        C70710eo.m103394b(C130683e.m213078b(), C70861ai.m103725d(new C130682d(this, 2)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

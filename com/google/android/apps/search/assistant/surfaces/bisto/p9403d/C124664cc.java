package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.cc */
/* compiled from: PG */
public class C124664cc implements C70298d {
    /* renamed from: b */
    public void mo106579b(C124685cx cxVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C124666ce.f343934a;
        if (euVar == null) {
            synchronized (C124666ce.class) {
                euVar = C124666ce.f343934a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.bisto.proto.BistoDownloaderService");
                    etVar.mo62433a(C124666ce.m204346a());
                    euVar = new C70716eu(etVar);
                    C124666ce.f343934a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C124666ce.m204346a(), C70861ai.m103725d(new C124665cd(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

package com.google.android.libraries.search.p3055n;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.cd */
/* compiled from: PG */
public class C39650cd implements C70298d {
    /* renamed from: b */
    public C70862aj mo41769b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo41770c(C39670cx cxVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: d */
    public void mo41771d(C39670cx cxVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C39652cf.f104373a;
        if (euVar == null) {
            synchronized (C39652cf.class) {
                euVar = C39652cf.f104373a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.soda.SodaAsrFrontendService");
                    etVar.mo62433a(C39652cf.m69119c());
                    etVar.mo62433a(C39652cf.m69117a());
                    etVar.mo62433a(C39652cf.m69118b());
                    euVar = new C70716eu(etVar);
                    C39652cf.f104373a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C39652cf.m69119c(), C70861ai.m103722a(new C39649cc(this, 2)), str, euVar, hashMap);
        C70710eo.m103394b(C39652cf.m69117a(), C70861ai.m103725d(new C39649cc(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C39652cf.m69118b(), C70861ai.m103725d(new C39649cc(this, 1)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

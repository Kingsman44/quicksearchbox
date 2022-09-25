package com.google.android.apps.gsa.nga.engine.p6098r.p6099a;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.r.a.o */
/* compiled from: PG */
public class C77488o implements C70298d {
    /* renamed from: b */
    public void mo72589b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C77490q.f213537a;
        if (euVar == null) {
            synchronized (C77490q.class) {
                euVar = C77490q.f213537a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.gsa.nga.engine.handsfree.service.HandsfreeService");
                    etVar.mo62433a(C77490q.m124307a());
                    euVar = new C70716eu(etVar);
                    C77490q.f213537a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C77490q.m124307a(), C70861ai.m103725d(new C77489p(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

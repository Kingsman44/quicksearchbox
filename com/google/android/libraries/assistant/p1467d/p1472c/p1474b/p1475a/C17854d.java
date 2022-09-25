package com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.d.c.b.a.d */
/* compiled from: PG */
public class C17854d implements C70298d {
    /* renamed from: b */
    public void mo23482b(C17859i iVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public C70862aj mo23483c() {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C17857g.f51183a;
        if (euVar == null) {
            synchronized (C17857g.class) {
                euVar = C17857g.f51183a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.assistant.appintegration.shared.grpc.callback.AppIntegrationCallbackService");
                    etVar.mo62433a(C17857g.m35098a());
                    etVar.mo62433a(C17857g.m35099b());
                    euVar = new C70716eu(etVar);
                    C17857g.f51183a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C17857g.m35098a(), C70861ai.m103723b(new C17856f(this, 1)), str, euVar, hashMap);
        C70710eo.m103394b(C17857g.m35099b(), C70861ai.m103725d(new C17856f(this, 0)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

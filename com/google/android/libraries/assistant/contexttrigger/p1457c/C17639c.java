package com.google.android.libraries.assistant.contexttrigger.p1457c;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.c */
/* compiled from: PG */
public class C17639c implements C70298d {
    /* renamed from: b */
    public void mo23418b(C17655s sVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo23419c(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C17641e.f50760a;
        if (euVar == null) {
            synchronized (C17641e.class) {
                euVar = C17641e.f50760a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.context_trigger.grpc.ContextTrigger");
                    etVar.mo62433a(C17641e.m34937a());
                    etVar.mo62433a(C17641e.m34938b());
                    euVar = new C70716eu(etVar);
                    C17641e.f50760a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C17641e.m34937a(), C70861ai.m103725d(new C17640d(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C17641e.m34938b(), C70861ai.m103725d(new C17640d(this, 1)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

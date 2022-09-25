package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C51809dy;
import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cg */
/* compiled from: PG */
public class C35578cg implements C70298d {
    /* renamed from: b */
    public void mo39721b(C51809dy dyVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C35580ci.f93403a;
        if (euVar == null) {
            synchronized (C35580ci.class) {
                euVar = C35580ci.f93403a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.assistant.performer.communication.IncomingCallExecutionService");
                    etVar.mo62433a(C35580ci.m63961a());
                    euVar = new C70716eu(etVar);
                    C35580ci.f93403a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C35580ci.m63961a(), C70861ai.m103725d(new C35579ch(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

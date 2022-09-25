package com.google.android.libraries.assistant.p1522k.p1523a.p1524a;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.k.a.a.g */
/* compiled from: PG */
public class C18403g implements C70298d {
    /* renamed from: b */
    public void mo21194b(C18400d dVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C18405i.f52236a;
        if (euVar == null) {
            synchronized (C18405i.class) {
                euVar = C18405i.f52236a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.assistant.gmm.grpc.gmmstartup.proto.AssistantStateService");
                    etVar.mo62433a(C18405i.m35848a());
                    euVar = new C70716eu(etVar);
                    C18405i.f52236a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C18405i.m35848a(), C70861ai.m103725d(new C18404h(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9723b;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.b.d */
/* compiled from: PG */
public class C128465d implements C70298d {
    /* renamed from: b */
    public void mo74098b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C128466e.f353321a;
        if (euVar == null) {
            synchronized (C128466e.class) {
                euVar = C128466e.f353321a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("nga_warm_actions.WarmActionsSettingsListenerService");
                    etVar.mo62433a(C128466e.m209641a());
                    euVar = new C70716eu(etVar);
                    C128466e.f353321a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C128466e.m209641a(), C70861ai.m103725d(new C128463b(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

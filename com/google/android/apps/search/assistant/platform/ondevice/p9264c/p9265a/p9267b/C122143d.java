package com.google.android.apps.search.assistant.platform.ondevice.p9264c.p9265a.p9267b;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.c.a.b.d */
/* compiled from: PG */
public class C122143d implements C70298d {
    /* renamed from: b */
    public void mo105546b(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C122144e.f338813a;
        if (euVar == null) {
            synchronized (C122144e.class) {
                euVar = C122144e.f338813a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.ondevice.oneplatform.server.prewarm.PrewarmService");
                    etVar.mo62433a(C122144e.m201687a());
                    euVar = new C70716eu(etVar);
                    C122144e.f338813a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C122144e.m201687a(), C70861ai.m103725d(new C122141b(this)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

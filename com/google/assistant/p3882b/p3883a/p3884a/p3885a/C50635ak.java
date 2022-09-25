package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.assistant.b.a.a.a.ak */
/* compiled from: PG */
public class C50635ak implements C70298d {
    /* renamed from: a */
    public void mo53411a(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C50636al.f131723a;
        if (euVar == null) {
            synchronized (C50636al.class) {
                euVar = C50636al.f131723a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.assistant.agentdirectory.web.server.proto.UpdatesCenterOnDeviceService");
                    etVar.mo62433a(C50636al.m85866a());
                    etVar.mo62433a(C50636al.m85867b());
                    euVar = new C70716eu(etVar);
                    C50636al.f131723a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C50636al.m85866a(), C70861ai.m103725d(new C50633ai(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C50636al.m85867b(), C70861ai.m103725d(new C50633ai(this, 1)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

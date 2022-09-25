package com.google.android.apps.search.fedora.p10110k.p10112b;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.fedora.k.b.c */
/* compiled from: PG */
public class C133013c implements C70298d {
    /* renamed from: b */
    public void mo110952b(C133017g gVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo110953c(C133025o oVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: d */
    public void mo110954d(C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C133015e.f362729a;
        if (euVar == null) {
            synchronized (C133015e.class) {
                euVar = C133015e.f362729a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.fedora.trainregistrationservice.proto.FedoraTrainRegistrationService");
                    etVar.mo62433a(C133015e.m215981b());
                    etVar.mo62433a(C133015e.m215982c());
                    etVar.mo62433a(C133015e.m215983d());
                    euVar = new C70716eu(etVar);
                    C133015e.f362729a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C133015e.m215981b(), C70861ai.m103725d(new C133014d(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C133015e.m215982c(), C70861ai.m103725d(new C133014d(this, 1)), str, euVar, hashMap);
        C70710eo.m103394b(C133015e.m215983d(), C70861ai.m103725d(new C133014d(this, 2)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

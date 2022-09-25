package com.google.android.libraries.gsa.actionusermodel;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ab */
/* compiled from: PG */
public class C22044ab implements C70298d {
    /* renamed from: b */
    public void mo27340b(C22065aw awVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo27341c(C22073bc bcVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: d */
    public void mo27342d(C22077bg bgVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: e */
    public void mo27343e(C22075be beVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: f */
    public void mo27344f(C22079bi biVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C22046ad.f60768a;
        if (euVar == null) {
            synchronized (C22046ad.class) {
                euVar = C22046ad.f60768a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.action_user_model.gsa.Aum");
                    etVar.mo62433a(C22046ad.m41294b());
                    etVar.mo62433a(C22046ad.m41297e());
                    etVar.mo62433a(C22046ad.m41295c());
                    etVar.mo62433a(C22046ad.m41296d());
                    etVar.mo62433a(C22046ad.m41293a());
                    euVar = new C70716eu(etVar);
                    C22046ad.f60768a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C22046ad.m41294b(), C70861ai.m103725d(new C22045ac(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C22046ad.m41297e(), C70861ai.m103725d(new C22045ac(this, 1)), str, euVar, hashMap);
        C70710eo.m103394b(C22046ad.m41295c(), C70861ai.m103725d(new C22045ac(this, 2)), str, euVar, hashMap);
        C70710eo.m103394b(C22046ad.m41296d(), C70861ai.m103725d(new C22045ac(this, 3)), str, euVar, hashMap);
        C70710eo.m103394b(C22046ad.m41293a(), C70861ai.m103725d(new C22045ac(this, 4)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

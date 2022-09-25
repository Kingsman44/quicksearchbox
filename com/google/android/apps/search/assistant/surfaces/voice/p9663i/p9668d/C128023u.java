package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.u */
/* compiled from: PG */
public class C128023u implements C70298d {
    /* renamed from: b */
    public void mo108300b(C128005c cVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo108301c(C128003an anVar, C70862aj ajVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C128024v.f352296a;
        if (euVar == null) {
            synchronized (C128024v.class) {
                euVar = C128024v.f352296a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.handsfree.motion.MotionSignalsService");
                    etVar.mo62433a(C128024v.m209159a());
                    etVar.mo62433a(C128024v.m209160b());
                    euVar = new C70716eu(etVar);
                    C128024v.f352296a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103394b(C128024v.m209159a(), C70861ai.m103725d(new C128021s(this, 0)), str, euVar, hashMap);
        C70710eo.m103394b(C128024v.m209160b(), C70861ai.m103725d(new C128021s(this, 1)), str, euVar, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}

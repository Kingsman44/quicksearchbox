package com.google.android.apps.search.transcription.p10670f.p10677f;

import com.google.android.apps.search.transcription.p10670f.C141848bp;
import com.google.android.apps.search.transcription.p10670f.C141920n;
import com.google.android.apps.search.transcription.p10670f.C141921o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;

/* renamed from: com.google.android.apps.search.transcription.f.f.b */
/* compiled from: PG */
public final class C141868b implements C141871e {

    /* renamed from: a */
    private static final C59071e f384969a = C59071e.m91332i("com.google.android.apps.search.transcription.f.f.b");

    /* renamed from: a */
    public final void mo116863a(C66611ci ciVar, C141848bp bpVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C67238p.f182737f);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C67238p.f182737f);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C67238p pVar = (C67238p) obj;
            if (pVar.f182740b == 1) {
                C67438ag agVar = (C67438ag) pVar.f182741c;
                if ((agVar.f183258a & 4) != 0) {
                    ((C59052c) ((C59052c) f384969a.mo56224b()).mo56372aa(41930)).mo56386p("Received a final result for a segment");
                    C67442ak akVar = agVar.f183261d;
                    if (akVar == null) {
                        akVar = C67442ak.f183276i;
                    }
                    C62971cq<C67468p> cqVar = akVar.f183281d;
                    C141920n nVar = (C141920n) C141921o.f385102d.createBuilder();
                    for (C67468p pVar2 : cqVar) {
                        String str = pVar2.f183367b;
                        nVar.copyOnWrite();
                        C141921o oVar = (C141921o) nVar.instance;
                        str.getClass();
                        oVar.mo116889a();
                        oVar.f385104a.add(str);
                        float f = pVar2.f183368c;
                        nVar.copyOnWrite();
                        C141921o oVar2 = (C141921o) nVar.instance;
                        oVar2.mo116890b();
                        oVar2.f385105b.mo58861g(f);
                    }
                    bpVar.mo116733g((C141921o) nVar.build());
                }
                int a = C67437af.m97466a(agVar.f183259b);
                if (a != 0 && a == 2) {
                    ((C59052c) ((C59052c) f384969a.mo56224b()).mo56372aa(41929)).mo56386p("Received the final result for the recognition");
                    bpVar.mo116732f();
                }
            }
        }
    }
}

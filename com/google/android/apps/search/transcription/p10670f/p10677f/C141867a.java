package com.google.android.apps.search.transcription.p10670f.p10677f;

import com.google.android.apps.search.transcription.p10670f.C141848bp;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.search.transcription.f.f.a */
/* compiled from: PG */
public final class C141867a implements C141871e {
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
            if (pVar.f182740b == 2) {
                C67464l lVar = (C67464l) pVar.f182741c;
                if ((lVar.f183358a & 1) != 0) {
                    C67463k a = C67463k.m97475a(lVar.f183359b);
                    if (a == null) {
                        a = C67463k.START_OF_SPEECH;
                    }
                    if (!a.equals(C67463k.START_OF_SPEECH)) {
                        C67463k a2 = C67463k.m97475a(lVar.f183359b);
                        if (a2 == null) {
                            a2 = C67463k.START_OF_SPEECH;
                        }
                        if (!a2.equals(C67463k.END_OF_SPEECH)) {
                            C67463k a3 = C67463k.m97475a(lVar.f183359b);
                            if (a3 == null) {
                                a3 = C67463k.START_OF_SPEECH;
                            }
                            if (!a3.equals(C67463k.END_OF_UTTERANCE)) {
                                return;
                            }
                        }
                        bpVar.mo116727a();
                        return;
                    }
                    bpVar.mo116735i();
                }
            }
        }
    }
}

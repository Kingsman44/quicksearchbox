package com.google.android.apps.search.transcription.p10670f.p10677f;

import com.google.android.apps.search.transcription.p10670f.C141805ax;
import com.google.android.apps.search.transcription.p10670f.C141806ay;
import com.google.android.apps.search.transcription.p10670f.C141848bp;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67476x;

/* renamed from: com.google.android.apps.search.transcription.f.f.d */
/* compiled from: PG */
public final class C141870d implements C141871e {
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
                int a = C67437af.m97466a(agVar.f183259b);
                if ((a == 0 || a == 1) && (agVar.f183258a & 8) != 0) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    C67476x xVar = agVar.f183262e;
                    if (xVar == null) {
                        xVar = C67476x.f183390i;
                    }
                    while (true) {
                        boolean z = false;
                        for (C67474v vVar : xVar.f183393b) {
                            if ((vVar.f183386a & 1) != 0) {
                                String str = vVar.f183387b;
                                double d = vVar.f183388c;
                                if (z || d < 0.9d) {
                                    sb.append(str);
                                    z = true;
                                } else {
                                    sb2.append(str);
                                }
                            }
                        }
                        C141805ax axVar = (C141805ax) C141806ay.f384845d.createBuilder();
                        String sb3 = sb2.toString();
                        axVar.copyOnWrite();
                        C141806ay ayVar = (C141806ay) axVar.instance;
                        ayVar.f384847a = 1 | ayVar.f384847a;
                        ayVar.f384848b = sb3;
                        String sb4 = sb.toString();
                        axVar.copyOnWrite();
                        C141806ay ayVar2 = (C141806ay) axVar.instance;
                        ayVar2.f384847a |= 2;
                        ayVar2.f384849c = sb4;
                        bpVar.mo116731e((C141806ay) axVar.build());
                        return;
                    }
                }
            }
        }
    }
}

package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p791a.p792a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C12329d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15481g f39138a;

    public /* synthetic */ C12329d(C15481g gVar) {
        this.f39138a = gVar;
    }

    public final Object apply(Object obj) {
        Object obj2;
        C67464l lVar;
        C15481g gVar = this.f39138a;
        C66611ci ciVar = (C66611ci) obj;
        C62940bt r1 = C62942bv.checkIsLite(C67238p.f182737f);
        ciVar.mo58887l(r1);
        Object l = ciVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj2 = r1.f169969b;
        } else {
            obj2 = r1.mo58889c(l);
        }
        C67238p pVar = (C67238p) obj2;
        if (pVar.f182740b == 2) {
            lVar = (C67464l) pVar.f182741c;
        } else {
            lVar = C67464l.f183356e;
        }
        C67463k a = C67463k.m97475a(lVar.f183359b);
        if (a == null) {
            a = C67463k.START_OF_SPEECH;
        }
        if (a == C67463k.END_OF_SPEECH) {
            gVar.mo22352b(C37179a.f97458ad);
        } else {
            C67463k a2 = C67463k.m97475a(lVar.f183359b);
            if (a2 == null) {
                a2 = C67463k.START_OF_SPEECH;
            }
            if (a2 == C67463k.START_OF_SPEECH) {
                gVar.mo22352b(C37179a.f97467am);
            }
        }
        return lVar;
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.common.base.C58837ba;
import com.google.speech.p5224k.p5225a.C67193ak;
import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.n */
/* compiled from: PG */
public final /* synthetic */ class C128382n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C128384p f353088a;

    /* renamed from: b */
    public final /* synthetic */ C67194al f353089b;

    public /* synthetic */ C128382n(C128384p pVar, C67194al alVar) {
        this.f353088a = pVar;
        this.f353089b = alVar;
    }

    public final void run() {
        C128384p pVar = this.f353088a;
        C67194al alVar = this.f353089b;
        if (C128384p.m209502d(alVar)) {
            if (pVar.f353097e) {
                if (!C58837ba.m90859h(pVar.f353099g)) {
                    String str = pVar.f353099g;
                    C67193ak akVar = alVar.f182646b;
                    if (akVar == null) {
                        akVar = C67193ak.f182639c;
                    }
                    if (str.equals(akVar.f182642b)) {
                        return;
                    }
                }
                pVar.mo108406c(alVar);
            } else if (C128384p.m209502d(alVar)) {
                C67194al alVar2 = (C67194al) pVar.f353094b.peekLast();
                if (alVar2 != null) {
                    C67193ak akVar2 = alVar2.f182646b;
                    if (akVar2 == null) {
                        akVar2 = C67193ak.f182639c;
                    }
                    String str2 = akVar2.f182642b;
                    C67193ak akVar3 = alVar.f182646b;
                    if (akVar3 == null) {
                        akVar3 = C67193ak.f182639c;
                    }
                    if (str2.equals(akVar3.f182642b)) {
                        return;
                    }
                }
                pVar.f353094b.offerLast(alVar);
            }
        }
    }
}

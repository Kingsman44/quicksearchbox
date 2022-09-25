package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.common.base.C58817ah;
import com.google.speech.recognizer.p5233a.C67432aa;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67439ah;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67467o;
import com.google.speech.recognizer.p5233a.C67468p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.v */
/* compiled from: PG */
public final /* synthetic */ class C106370v implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C106370v f296717a = new C106370v();

    private /* synthetic */ C106370v() {
    }

    public final Object apply(Object obj) {
        C67438ag agVar = (C67438ag) obj;
        C118928k kVar = C106372x.f296719a;
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            return agVar;
        }
        C67432aa aaVar = (C67432aa) agVar.toBuilder();
        C67439ah ahVar = (C67439ah) C67442ak.f183276i.createBuilder();
        C67467o oVar = (C67467o) C67468p.f183364g.createBuilder();
        String e = C106372x.m177166e(agVar);
        oVar.copyOnWrite();
        C67468p pVar = (C67468p) oVar.instance;
        e.getClass();
        pVar.f183366a |= 1;
        pVar.f183367b = e;
        ahVar.mo59869b((C67468p) oVar.build());
        C67442ak akVar = (C67442ak) ahVar.build();
        aaVar.copyOnWrite();
        C67438ag agVar2 = (C67438ag) aaVar.instance;
        akVar.getClass();
        agVar2.f183264g = akVar;
        agVar2.f183258a |= 32;
        return (C67438ag) aaVar.build();
    }
}

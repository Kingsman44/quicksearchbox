package com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8531a.C111774a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8531a.C111775b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8531a.C111776c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52075eh;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58729pv;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.f.b.b */
/* compiled from: PG */
public final class C111790b {

    /* renamed from: a */
    private final C111776c f310686a;

    public C111790b(C111776c cVar) {
        this.f310686a = cVar;
    }

    /* renamed from: a */
    public final void mo99229a(C58485gu guVar) {
        C52081en enVar;
        C111776c cVar = this.f310686a;
        C58495hd hdVar = C58729pv.f156485a;
        if (guVar == null || guVar.isEmpty()) {
            enVar = C52081en.f136679i;
        } else {
            C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C51809dy dyVar = (C51809dy) guVar.get(i2);
                C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                eoVar.copyOnWrite();
                C52083ep epVar = (C52083ep) eoVar.instance;
                epVar.f136691a |= 1;
                epVar.f136694d = 0;
                C52075eh ehVar = (C52075eh) C52076ei.f136664f.createBuilder();
                ehVar.copyOnWrite();
                C52076ei eiVar = (C52076ei) ehVar.instance;
                dyVar.getClass();
                eiVar.f136668c = dyVar;
                eiVar.f136666a |= 32;
                C52076ei eiVar2 = (C52076ei) ehVar.build();
                eoVar.copyOnWrite();
                C52083ep epVar2 = (C52083ep) eoVar.instance;
                eiVar2.getClass();
                epVar2.f136693c = eiVar2;
                epVar2.f136692b = 4;
                elVar.mo53786c((C52083ep) eoVar.build());
            }
            if (!hdVar.isEmpty()) {
                C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
                Map.EL.forEach(hdVar, new C111789a(ewVar));
                C52091ex exVar = (C52091ex) ewVar.build();
                elVar.copyOnWrite();
                C52081en enVar2 = (C52081en) elVar.instance;
                exVar.getClass();
                enVar2.f136685e = exVar;
                enVar2.f136681a |= 16;
            }
            enVar = (C52081en) elVar.build();
        }
        cVar.f310680a.mo28205e(cVar.f310681b.f310684a, "[Tapas] AssistantWrapper.processConversationDelta", TimeoutException.class, C111774a.f310678a);
        cVar.f310682c.mo27701e(new C111775b(enVar));
    }
}

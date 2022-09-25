package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125038d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125521a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125703b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125751p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126180i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.p9475a.C126172a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.be */
/* compiled from: PG */
public final /* synthetic */ class C126218be implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126223bj f347789a;

    /* renamed from: b */
    public final /* synthetic */ C125751p f347790b;

    public /* synthetic */ C126218be(C126223bj bjVar, C125751p pVar) {
        this.f347789a = bjVar;
        this.f347790b = pVar;
    }

    public final C60870cx apply(Object obj) {
        C126223bj bjVar = this.f347789a;
        C125751p pVar = this.f347790b;
        Boolean bool = (Boolean) obj;
        C126180i iVar = bjVar.f347810j;
        C69664n.m101061g(pVar, "fulfillmentResult");
        C125703b bVar = pVar.f346565c;
        if (bVar instanceof C125521a) {
            C126172a aVar = iVar.f347703a;
            C125034a aVar2 = pVar.f346563a;
            C125521a aVar3 = (C125521a) bVar;
            C69664n.m101061g(aVar2, "triggerType");
            C69664n.m101061g(aVar3, "emojiFulfillmentResult");
            if (!C69664n.m101066l(aVar3.f346123a, C125038d.f344972d)) {
                C125038d dVar = aVar3.f346123a;
                C125034a aVar4 = C125034a.TRIGGER_UNKNOWN;
                int ordinal = aVar2.ordinal();
                if (ordinal == 1) {
                    if (dVar.f344976c) {
                        C126181j jVar = aVar.f347671a;
                        boolean z = dVar.f344975b;
                        h a = h.a(dVar.f344974a);
                        if (a == null) {
                            a = h.f;
                        }
                        jVar.mo107439j(z, a == h.c);
                    }
                    C126181j jVar2 = aVar.f347671a;
                    h a2 = h.a(dVar.f344974a);
                    if (a2 == null) {
                        a2 = h.f;
                    }
                    jVar2.mo107445p(a2, 3);
                } else if (ordinal == 2) {
                    aVar.f347671a.mo107440k(dVar.f344975b);
                }
            }
        }
        if (pVar.f346565c.mo107031a() == 3) {
            bjVar.f347805e.mo107291o(pVar.f346564b, pVar.f346563a);
            return C60866ct.f164955a;
        }
        if (pVar.f346565c.mo107031a() == 1) {
            bjVar.f347805e.mo107290n(pVar.f346564b, pVar.f346563a);
        }
        return bjVar.f347818r.mo107457a();
    }
}

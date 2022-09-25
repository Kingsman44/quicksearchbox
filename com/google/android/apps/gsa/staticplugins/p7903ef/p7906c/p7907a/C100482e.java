package com.google.android.apps.gsa.staticplugins.p7903ef.p7906c.p7907a;

import com.google.android.apps.gsa.c.b;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85385b;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.state.p6874f.C87034a;
import com.google.android.apps.gsa.search.core.state.p6874f.C87038e;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.staticplugins.p7903ef.p7905b.C100476a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37726t;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C100482e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100486i f280892a;

    /* renamed from: b */
    public final /* synthetic */ Query f280893b;

    public /* synthetic */ C100482e(C100486i iVar, Query query) {
        this.f280892a = iVar;
        this.f280893b = query;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100486i iVar = this.f280892a;
        Query query = this.f280893b;
        C118826c cVar = (C118826c) obj;
        C58976aa aaVar = C58975e.f156826a;
        C87034a aVar = new C87034a();
        aVar.mo80649c(273);
        aVar.mo80652f(query);
        ClientConfig clientConfig = iVar.f280906k;
        clientConfig.getClass();
        aVar.mo80648b(clientConfig.f236951d);
        aVar.mo80651e(false);
        aVar.mo80650d(false);
        C87038e.m140571e(aVar.mo80647a());
        C87682aj ajVar = iVar.f280900e.f280915a;
        if (ajVar != null) {
            C87684al alVar = new C87684al(C88244um.SET_QUERY);
            alVar.mo81966c(query);
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
        }
        iVar.f280898c.f280914a = query;
        iVar.f280900e.mo91935a(6);
        C100476a aVar2 = new C100476a(query, iVar.f280901f, iVar.f280899d, iVar.f280904i, iVar.f280905j, iVar.f280907l);
        C85385b bVar = iVar.f280899d;
        C85379a aVar3 = iVar.f280901f;
        C92460b b = iVar.f280902g.mo87219b(query);
        C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
        C37705a aVar4 = (C37705a) C37773c.f100243c.createBuilder();
        C37726t tVar = C37726t.f100154a;
        aVar4.copyOnWrite();
        C37773c cVar2 = (C37773c) aVar4.instance;
        tVar.getClass();
        cVar2.f100246b = tVar;
        cVar2.f100245a = 8;
        bkVar.copyOnWrite();
        C37407bl blVar = (C37407bl) bkVar.instance;
        C37773c cVar3 = (C37773c) aVar4.build();
        cVar3.getClass();
        blVar.f99328b = cVar3;
        blVar.f99327a |= 1;
        return bVar.mo78909c(query, aVar3, C58833ax.m90834k(((u) iVar.f280903h.mo27525b()).a((C37407bl) bkVar.build(), query, b, b.f, aVar2, false, C39226b.TAG_TRANSCRIPTION_VOICE_IME)), aVar2);
    }
}

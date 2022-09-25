package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.al */
/* compiled from: PG */
public final /* synthetic */ class C138390al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138396ar f376483a;

    /* renamed from: b */
    public final /* synthetic */ int f376484b;

    public /* synthetic */ C138390al(C138396ar arVar, int i) {
        this.f376483a = arVar;
        this.f376484b = i;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C138396ar arVar = this.f376483a;
        int i = this.f376484b;
        C138464cl clVar = (C138464cl) C138467co.f376633f.createBuilder();
        C138678v a = C138396ar.m224805a((C138678v) obj);
        clVar.copyOnWrite();
        C138467co coVar = (C138467co) clVar.instance;
        a.getClass();
        coVar.f376637c = a;
        coVar.f376635a |= 4;
        long b = arVar.f376496f.mo26870b();
        clVar.copyOnWrite();
        C138467co coVar2 = (C138467co) clVar.instance;
        coVar2.f376635a |= 1;
        coVar2.f376636b = b;
        clVar.copyOnWrite();
        C138467co coVar3 = (C138467co) clVar.instance;
        coVar3.f376639e = i - 1;
        coVar3.f376635a |= 16;
        C138467co coVar4 = (C138467co) clVar.build();
        if (i == 2) {
            arVar.f376495e.mo114289a("ZERO_PREFIX_CACHE_REFRESH_COUNT");
            cxVar = C47633f.m84733g(arVar.f376492b.mo46042d()).mo51516i(new C138394ap(arVar, coVar4), arVar.f376497g);
        } else {
            cxVar = arVar.f376492b.mo46039a(new C138385ag(coVar4), C60826bg.f164896a);
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C138386ah(arVar, coVar4)), arVar.f376497g);
    }
}

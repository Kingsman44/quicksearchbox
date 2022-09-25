package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.common.base.C58832aw;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C138394ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138396ar f376488a;

    /* renamed from: b */
    public final /* synthetic */ C138467co f376489b;

    public /* synthetic */ C138394ap(C138396ar arVar, C138467co coVar) {
        this.f376488a = arVar;
        this.f376489b = coVar;
    }

    public final C60870cx apply(Object obj) {
        C138396ar arVar = this.f376488a;
        C138467co coVar = this.f376489b;
        C138678v vVar = ((C138467co) obj).f376637c;
        if (vVar == null) {
            vVar = C138678v.f377195e;
        }
        C62971cq cqVar = vVar.f377199c;
        C138678v vVar2 = coVar.f376637c;
        if (vVar2 == null) {
            vVar2 = C138678v.f377195e;
        }
        if (C58832aw.m90831a(cqVar, vVar2.f377199c)) {
            arVar.f376495e.mo114289a("ZERO_PREFIX_CACHE_DUPLICATE_REFRESH_COUNT");
        }
        return arVar.f376492b.mo46039a(new C138389ak(coVar), C60826bg.f164896a);
    }
}

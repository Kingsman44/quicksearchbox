package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.am */
/* compiled from: PG */
public final /* synthetic */ class C138391am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138396ar f376485a;

    public /* synthetic */ C138391am(C138396ar arVar) {
        this.f376485a = arVar;
    }

    public final Object apply(Object obj) {
        C138396ar arVar = this.f376485a;
        C138467co coVar = (C138467co) obj;
        int a = C138466cn.m224867a(coVar.f376639e);
        if (a != 0 && a == 2 && coVar.f376638d < coVar.f376636b) {
            arVar.f376495e.mo114289a("ZERO_PREFIX_CACHE_SEEN_COUNT");
        }
        if ((coVar.f376635a & 4) == 0) {
            return Optional.empty();
        }
        C138678v vVar = coVar.f376637c;
        if (vVar == null) {
            vVar = C138678v.f377195e;
        }
        return Optional.m71637of(vVar);
    }
}

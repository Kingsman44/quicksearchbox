package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.cq */
/* compiled from: PG */
public final /* synthetic */ class C138469cq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138471cs f376643a;

    public /* synthetic */ C138469cq(C138471cs csVar) {
        this.f376643a = csVar;
    }

    public final C60870cx apply(Object obj) {
        C138471cs csVar = this.f376643a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C138454cb cbVar = csVar.f376645a;
        C60870cx i = C60856cj.m92900i(Duration.ofMinutes(cbVar.f376618i));
        if (cbVar.f376615f) {
            i = cbVar.mo114286a();
        }
        C138447bv bvVar = new C138447bv(cbVar);
        return C60922j.m93044g(i, C47810es.m84963c(bvVar), cbVar.f376614e);
    }
}

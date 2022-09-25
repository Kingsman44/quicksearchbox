package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63884p;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.n */
/* compiled from: PG */
public final /* synthetic */ class C136912n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136913o f372624a;

    /* renamed from: b */
    public final /* synthetic */ C63884p f372625b;

    /* renamed from: c */
    public final /* synthetic */ C137009dj f372626c;

    public /* synthetic */ C136912n(C136913o oVar, C63884p pVar, C137009dj djVar) {
        this.f372624a = oVar;
        this.f372625b = pVar;
        this.f372626c = djVar;
    }

    public final C60870cx apply(Object obj) {
        C136913o oVar = this.f372624a;
        C63884p pVar = this.f372625b;
        C137009dj djVar = this.f372626c;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue() || (pVar.f172738a & 1) == 0) {
            return C60856cj.m92900i(bool);
        }
        C60870cx a = oVar.f372628a.mo103976a();
        C136911m mVar = new C136911m(djVar, pVar);
        return C60922j.m93044g(a, C47810es.m84963c(mVar), oVar.f372629b);
    }
}

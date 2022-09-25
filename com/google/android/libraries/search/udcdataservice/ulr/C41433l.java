package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.l */
/* compiled from: PG */
public final /* synthetic */ class C41433l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C41438q f108216a;

    public /* synthetic */ C41433l(C41438q qVar) {
        this.f108216a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C41438q qVar = this.f108216a;
        C41441t tVar = (C41441t) obj;
        if ((tVar.f108231a & 1) != 0) {
            C41389e eVar = tVar.f108232b;
            if (eVar == null) {
                eVar = C41389e.f108143e;
            }
            return C60856cj.m92900i(eVar);
        }
        C60870cx a = qVar.mo43955a();
        C60870cx b = qVar.mo43956b(a);
        C41430i iVar = new C41430i(a);
        return C60922j.m93045h(b, C47810es.m84966f(iVar), qVar.f108222b);
    }
}

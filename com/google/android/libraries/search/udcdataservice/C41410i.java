package com.google.android.libraries.search.udcdataservice;

import com.google.android.libraries.search.udcdataservice.facs.C41397g;
import com.google.android.libraries.search.udcdataservice.facs.C41406p;
import com.google.android.libraries.search.udcdataservice.ulr.C41438q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.udcdataservice.i */
/* compiled from: PG */
public final /* synthetic */ class C41410i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C41418q f108181a;

    public /* synthetic */ C41410i(C41418q qVar) {
        this.f108181a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C41418q qVar = this.f108181a;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C41406p pVar = (C41406p) qVar.f108192a;
        C60870cx a = pVar.mo43942a();
        C41397g gVar = C41397g.f108156a;
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(gVar), pVar.f108172c);
        C41438q qVar2 = qVar.f108193b;
        return C47638k.m84753d(h, qVar2.mo43956b(qVar2.mo43955a())).mo51520a(C41417p.f108189a, qVar.f108194c);
    }
}

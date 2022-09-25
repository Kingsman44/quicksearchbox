package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.l */
/* compiled from: PG */
public final /* synthetic */ class C109156l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C109144ac f303963a;

    /* renamed from: b */
    public final /* synthetic */ Context f303964b;

    public /* synthetic */ C109156l(C109144ac acVar, Context context) {
        this.f303963a = acVar;
        this.f303964b = context;
    }

    public final C60870cx apply(Object obj) {
        C109144ac acVar = this.f303963a;
        Context context = this.f303964b;
        C118826c cVar = (C118826c) obj;
        ((C58970a) ((C58970a) acVar.f303932a.mo56224b()).mo56372aa(23898)).mo56386p("handleRefreshAction(): disconnect success");
        acVar.f303938g.mo78242b();
        C60870cx e = acVar.mo97637e(context);
        C109159o oVar = new C109159o(acVar);
        return C60922j.m93045h(e, C47810es.m84966f(oVar), acVar.f303939h);
    }
}

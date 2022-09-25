package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.j */
/* compiled from: PG */
public final /* synthetic */ class C41431j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C41438q f108214a;

    public /* synthetic */ C41431j(C41438q qVar) {
        this.f108214a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C41438q qVar = this.f108214a;
        if (((Boolean) obj).booleanValue()) {
            C60870cx a = qVar.f108223c.mo50214a(qVar.f108226f);
            C41436o oVar = new C41436o(qVar);
            return C60922j.m93045h(a, C47810es.m84966f(oVar), qVar.f108221a);
        }
        throw new C46167as("This is not a google account");
    }
}

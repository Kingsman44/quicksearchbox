package com.google.android.libraries.search.udcdataservice.facs;

import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.udcdataservice.facs.l */
/* compiled from: PG */
public final /* synthetic */ class C41402l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C41406p f108164a;

    public /* synthetic */ C41402l(C41406p pVar) {
        this.f108164a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C41406p pVar = this.f108164a;
        if (((Boolean) obj).booleanValue()) {
            C60870cx a = pVar.f108173d.mo50214a(pVar.f108174e);
            C41401k kVar = new C41401k(pVar);
            return C60922j.m93044g(a, C47810es.m84963c(kVar), pVar.f108172c);
        }
        throw new C46167as("This is not a google account");
    }
}

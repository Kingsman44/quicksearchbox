package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.g */
/* compiled from: PG */
public final /* synthetic */ class C106810g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106816m f297662a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297663b;

    public /* synthetic */ C106810g(C106816m mVar, C60870cx cxVar) {
        this.f297662a = mVar;
        this.f297663b = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C106816m mVar = this.f297662a;
        C60870cx cxVar = this.f297663b;
        if (mVar.f297675f != null) {
            return C118826c.f331423b;
        }
        mVar.f297675f = new C106811h(mVar, cxVar);
        mVar.f297671b.mo90816f(mVar.f297675f);
        C60870cx cxVar2 = mVar.f297676g;
        C106806c cVar = new C106806c(mVar);
        return C60922j.m93044g(cxVar2, C47810es.m84963c(cVar), mVar.f297672c);
    }
}

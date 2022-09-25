package com.google.android.apps.gsa.staticplugins.p7374ag;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7159c.C90878al;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.y */
/* compiled from: PG */
final class C93845y extends C90878al {

    /* renamed from: a */
    final /* synthetic */ boolean f262106a;

    /* renamed from: b */
    final /* synthetic */ C93809aa f262107b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93845y(C93809aa aaVar, boolean z) {
        super("RefreshCookies", 1, 12);
        this.f262107b = aaVar;
        this.f262106a = z;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C60870cx cxVar;
        C118826c cVar = (C118826c) obj;
        synchronized (this.f262107b.f262047m) {
            this.f262107b.f262048n = false;
        }
        this.f262107b.mo88180g();
        C93829j jVar = (C93829j) this.f262107b.f262039e.mo17428b();
        if (this.f262106a) {
            cxVar = C60856cj.m92900i(true);
        } else {
            C60870cx a = jVar.f262085k.f262059c.mo47223a(jVar.f262083i.getString(C90507o.f253011a, (String) null));
            C93826g gVar = C93826g.f262072a;
            cxVar = C60922j.m93044g(a, C47810es.m84963c(gVar), jVar.f262079e);
        }
        C93828i iVar = new C93828i(jVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(iVar), jVar.f262080f);
        C93844x xVar = C93844x.f262105a;
        return C60922j.m93044g(h, C47810es.m84963c(xVar), this.f262107b.f262037c);
    }
}

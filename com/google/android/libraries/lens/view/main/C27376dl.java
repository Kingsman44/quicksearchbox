package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.weblrp.C28203q;
import com.google.android.libraries.lens.view.weblrp.C28204r;
import com.google.android.libraries.lens.view.weblrp.C28205s;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.base.C43271v;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.lens.view.main.dl */
/* compiled from: PG */
public final /* synthetic */ class C27376dl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74869a;

    public /* synthetic */ C27376dl(C27384dt dtVar) {
        this.f74869a = dtVar;
    }

    public final void run() {
        C27384dt dtVar = this.f74869a;
        C28205s sVar = dtVar.f75006z;
        sVar.f76773d.mo19974a(C37194a.f98613dn);
        C60870cx a = sVar.f76776g.mo46625a(C43271v.WEB_VIEW).mo46627a();
        C28203q qVar = new C28203q(sVar);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(qVar), sVar.f76772c);
        C28204r rVar = new C28204r(sVar);
        C46459k.m82829b(C60846c.m92878g(g, Throwable.class, C47810es.m84963c(rVar), sVar.f76772c), "Failed to execute WebX Prewarming", new Object[0]);
        if (dtVar.f74992l.mo30592b() || dtVar.f74995o.mo31462g(C26239a.ONELRP_EARLY_INIT_VIEWS)) {
            C27389dx dxVar = new C27389dx(dtVar);
            C60856cj.m92911t(a, C47810es.m84974n(dxVar), dtVar.f74993m);
        }
    }
}

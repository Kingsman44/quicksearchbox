package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.p8619b.p8620a;

import android.text.TextUtils;
import com.google.android.apps.gsa.n.g.a;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65839h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.b.a.c */
/* compiled from: PG */
public final class C114408c {

    /* renamed from: a */
    public final C21370a f317224a;

    /* renamed from: b */
    private final C86054o f317225b;

    /* renamed from: c */
    private final u f317226c;

    /* renamed from: d */
    private final a f317227d;

    public C114408c(C21370a aVar, C86054o oVar, u uVar, a aVar2) {
        this.f317224a = aVar;
        this.f317225b = oVar;
        this.f317226c = uVar;
        this.f317227d = aVar2;
    }

    /* renamed from: a */
    public final void mo101316a(C65839h hVar) {
        String str = hVar.f178979b;
        String F = this.f317225b.mo79659F();
        if (F == null || TextUtils.isEmpty(F)) {
            C60856cj.m92900i(C118826c.f331422a);
            return;
        }
        String str2 = hVar.f178979b;
        C60870cx d = this.f317226c.d(F, C65753ak.ASSISTANT_ASPIRE_ACTIVITY, this.f317227d.b("type.googleapis.com/geller.oneplatform.AspireActivityElement", hVar.toByteString(), hVar.f178979b), true);
        C114407b bVar = C114407b.f317223a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(bVar), C60826bg.f164896a);
        C114406a aVar = C114406a.f317222a;
        C60922j.m93044g(g, C47810es.m84963c(aVar), C60826bg.f164896a);
    }
}

package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.experiments.C46891c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5474a.C69631q;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bz */
/* compiled from: PG */
final class C46959bz implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C58495hd f122455a;

    /* renamed from: b */
    final /* synthetic */ C46891c f122456b;

    /* renamed from: c */
    final /* synthetic */ C46966cf f122457c;

    public C46959bz(C58495hd hdVar, C46891c cVar, C46966cf cfVar) {
        this.f122455a = hdVar;
        this.f122456b = cVar;
        this.f122457c = cfVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        if (!((C46940bg) obj).mo50932g(this.f122455a, C46946bm.m83607a(this.f122456b))) {
            return C60856cj.m92900i(new C47064r(false));
        }
        C46966cf cfVar = this.f122457c;
        C69631q qVar = cfVar.f122477k;
        String str = cfVar.f122470d;
        C46891c cVar = this.f122456b;
        C58817ah c = C47810es.m84963c(C46958by.f122454a);
        return C60922j.m93044g((C60870cx) qVar.mo17419a(str, cVar.f122345c, cVar.f122346d), C47810es.m84963c(c), C60826bg.f164896a);
    }
}

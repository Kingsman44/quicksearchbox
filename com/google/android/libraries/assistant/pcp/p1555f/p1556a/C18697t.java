package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18770i;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18712d;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.android.libraries.assistant.pcp.p1579n.C19001b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.t */
/* compiled from: PG */
public final /* synthetic */ class C18697t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18700w f52751a;

    /* renamed from: b */
    public final /* synthetic */ C18981k f52752b;

    /* renamed from: c */
    public final /* synthetic */ Optional f52753c;

    /* renamed from: d */
    public final /* synthetic */ C18718c f52754d;

    public /* synthetic */ C18697t(C18700w wVar, C18981k kVar, Optional optional, C18718c cVar) {
        this.f52751a = wVar;
        this.f52752b = kVar;
        this.f52753c = optional;
        this.f52754d = cVar;
    }

    public final C60870cx apply(Object obj) {
        C18700w wVar = this.f52751a;
        C18981k kVar = this.f52752b;
        Optional optional = this.f52753c;
        C18718c cVar = this.f52754d;
        C58495hd hdVar = (C58495hd) obj;
        C19001b bVar = (C19001b) wVar.f52760a.get(kVar);
        if (!optional.isEmpty()) {
            hdVar = (C58495hd) Collection.EL.stream(hdVar.entrySet()).collect(C58370cn.m89403c(C18693p.f52743a, new C18694q((C53306j) optional.get()), C18695r.f52745a));
        }
        if (bVar.mo24239b() == C18981k.PROACTIVE_BACKEND) {
            cVar.mo24115b(new C18770i(C18712d.f52789e, (C58485gu) Collection.EL.stream(hdVar.entrySet()).map(C18692o.f52742a).collect(C58370cn.f155946a)));
        }
        C58528ij w = hdVar.keySet();
        return C47633f.m84733g(bVar.mo24240c(w, cVar)).mo51516i(new C18685h(wVar, hdVar, cVar, optional), wVar.f52764e).mo51515h(new C18686i(), wVar.f52764e).mo51514f(Throwable.class, new C18687j(w), wVar.f52764e);
    }
}

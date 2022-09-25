package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130806h;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c.C130739ac;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c.C130792v;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c.C130793w;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9947a.p9948a.C131118a;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9947a.p9948a.C131121d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.l */
/* compiled from: PG */
public final /* synthetic */ class C130871l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130881v f358149a;

    /* renamed from: b */
    public final /* synthetic */ Executor f358150b;

    public /* synthetic */ C130871l(C130881v vVar, Executor executor) {
        this.f358149a = vVar;
        this.f358150b = executor;
    }

    public final C60870cx apply(Object obj) {
        C130881v vVar = this.f358149a;
        Executor executor = this.f358150b;
        C58485gu guVar = (C58485gu) obj;
        C131121d dVar = (C131121d) vVar.f358163d;
        C130806h hVar = dVar.f358615c;
        C58528ij ijVar = C131121d.f358613a;
        double d = dVar.f358617e;
        if (ijVar.isEmpty()) {
            ijVar = C130739ac.f357930a.keySet();
        }
        C130739ac acVar = (C130739ac) hVar;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(ijVar).map(new C130792v(acVar, d)).collect(C58370cn.f155946a);
        C60870cx a = C47638k.m84750a(guVar2).mo51520a(new C130793w(acVar, guVar2), acVar.f357933d);
        C131118a aVar = new C131118a(dVar);
        return C60922j.m93044g(C60922j.m93044g(a, C47810es.m84963c(aVar), dVar.f358616d), C47810es.m84963c(new C130865f(guVar)), executor);
    }
}

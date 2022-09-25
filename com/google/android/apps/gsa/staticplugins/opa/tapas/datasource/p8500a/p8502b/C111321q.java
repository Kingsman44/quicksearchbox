package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111649ad;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.q */
/* compiled from: PG */
public final /* synthetic */ class C111321q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309777a;

    /* renamed from: b */
    public final /* synthetic */ C49728r f309778b;

    public /* synthetic */ C111321q(C111305ag agVar, C49728r rVar) {
        this.f309777a = agVar;
        this.f309778b = rVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111305ag agVar = this.f309777a;
        C49728r rVar = this.f309778b;
        Map map = (Map) obj;
        C121492b a = C111305ag.f309731a.mo105233a("parseTapasCompletionResponse");
        C22871g gVar = agVar.f309732b;
        String str = rVar.f128342b;
        rVar.f128344d.size();
        C62971cq<C48578al> cqVar = rVar.f128344d;
        C58480gp e = C58485gu.m89837e();
        HashSet hashSet = new HashSet();
        for (C48578al alVar : cqVar) {
            if (alVar.f125509c.size() != 0) {
                Optional a2 = agVar.f309735e.mo99175a(alVar).mo99174a(alVar);
                String str2 = alVar.f125508b;
                a2.map(C111328x.f309795a);
                if (!a2.isEmpty() && !hashSet.contains(((C111649ad) a2.get()).f310418c)) {
                    C111649ad adVar = (C111649ad) a2.get();
                    e.mo55395g(adVar);
                    hashSet.add(adVar.f310418c);
                }
            }
        }
        C60870cx i = gVar.mo28209i(agVar.f309732b.mo28209i(C60856cj.m92906o((List) Collection.EL.stream(e.mo55394f()).map(new C111325u(agVar, rVar, map)).collect(C58370cn.f155946a)), "flatten the suggestion list", C111326v.f309789a), "parse TapasCompletionResponse", C111304af.f309730a);
        new C90873ag(i, agVar.f309732b, "fetchSuggestions completed", new C111310f(a)).mo85223a(new C111311g(a));
        return i;
    }
}

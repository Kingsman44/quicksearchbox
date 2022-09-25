package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C138429bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376549a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376550b;

    public /* synthetic */ C138429bd(C138445bt btVar, C138133o oVar) {
        this.f376549a = btVar;
        this.f376550b = oVar;
    }

    public final C60870cx apply(Object obj) {
        C138445bt btVar = this.f376549a;
        C138133o oVar = this.f376550b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            if (oVar.f375827d) {
                btVar.mo114284i(oVar);
            }
            return C60856cj.m92900i((C138678v) optional.get());
        }
        List list = (List) Collection.EL.stream(btVar.f376593p).map(new C138426ba(oVar)).collect(Collectors.toCollection(C138436bk.f376560a));
        C60870cx a = C47638k.m84750a(list).mo51520a(new C138437bl(btVar, list), btVar.f376583f);
        C138442bq bqVar = new C138442bq(btVar, oVar);
        return C60922j.m93045h(a, C47810es.m84966f(bqVar), btVar.f376583f);
    }
}

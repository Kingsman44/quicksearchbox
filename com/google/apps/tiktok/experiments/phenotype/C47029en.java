package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.phenotype.C47023ei;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.en */
/* compiled from: PG */
final class C47029en implements C60930r {

    /* renamed from: a */
    final /* synthetic */ AccountId f122591a;

    /* renamed from: b */
    final /* synthetic */ C47023ei f122592b;

    public C47029en(AccountId accountId, C47023ei eiVar) {
        this.f122591a = accountId;
        this.f122592b = eiVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        if (C69664n.m101066l(this.f122591a, this.f122592b.f122575f)) {
            return C60866ct.f164955a;
        }
        C47023ei eiVar = this.f122592b;
        AccountId accountId = this.f122591a;
        eiVar.f122575f = accountId;
        C47023ei.C47024a aVar = (C47023ei.C47024a) C47245e.m84045a(eiVar.f122570a, C47023ei.C47024a.class, accountId);
        C60870cx c = this.f122592b.f122572c.mo50246c(this.f122591a);
        List e = aVar.mo50983gT().mo50918e();
        List e2 = aVar.mo50982gS().mo50918e();
        List b = C69540x.m100944b(c);
        List<C47071y> M = C69540x.m100831M(e, e2);
        ArrayList arrayList = new ArrayList(C69540x.m100804k(M, 10));
        for (C47071y yVar : M) {
            arrayList.add(yVar.f122664b);
        }
        return C47638k.m84750a(C69540x.m100831M(b, arrayList)).mo51521b(C47810es.m84965e(new C47028em(e, e2, this.f122592b, c)), C60826bg.f164896a);
    }
}

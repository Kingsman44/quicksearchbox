package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58431eu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.em */
/* compiled from: PG */
final class C47028em implements C60930r {

    /* renamed from: a */
    final /* synthetic */ List f122587a;

    /* renamed from: b */
    final /* synthetic */ List f122588b;

    /* renamed from: c */
    final /* synthetic */ C47023ei f122589c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f122590d;

    public C47028em(List list, List list2, C47023ei eiVar, C60870cx cxVar) {
        this.f122587a = list;
        this.f122588b = list2;
        this.f122589c = eiVar;
        this.f122590d = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C58431eu<C47071y> c = C58431eu.m89653c(this.f122587a, this.f122588b);
        C47023ei eiVar = this.f122589c;
        C60870cx cxVar = this.f122590d;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(c, 10));
        for (C47071y yVar : c) {
            C63088z zVar = yVar.f122665c;
            String str = ((C46108a) C60856cj.m92909r(cxVar)).mo50210b().f121161f;
            C69664n.m101060f(str, "getDone(accountInfo).info().displayId");
            arrayList.add(eiVar.mo50978a((String) C60856cj.m92909r(yVar.f122664b), zVar, str, yVar.f122663a));
        }
        return C47638k.m84750a(arrayList).mo51521b(new C47027el(arrayList), C60826bg.f164896a);
    }
}

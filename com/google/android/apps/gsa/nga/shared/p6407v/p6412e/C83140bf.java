package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80435o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import com.google.common.p4522b.C58370cn;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bf */
/* compiled from: PG */
public final /* synthetic */ class C83140bf implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83145bk f226750a;

    public /* synthetic */ C83140bf(C83145bk bkVar) {
        this.f226750a = bkVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83145bk bkVar = this.f226750a;
        C80436p pVar = (C80436p) obj;
        C80435o oVar = (C80435o) C80436p.f220766g.createBuilder();
        oVar.mo74328a((Iterable) Collection.EL.stream(pVar.f220769b).map(new C83121an(bkVar)).collect(C58370cn.f155946a));
        boolean z = true;
        boolean z2 = (pVar.f220768a & 64) != 0;
        Objects.requireNonNull(pVar);
        C83122ao aoVar = new C83122ao(pVar);
        Objects.requireNonNull(oVar);
        C83080bg.m132478b(z2, aoVar, new C83123ap(oVar));
        if ((pVar.f220768a & 16) == 0) {
            z = false;
        }
        Objects.requireNonNull(pVar);
        C83124aq aqVar = new C83124aq(pVar);
        Objects.requireNonNull(oVar);
        C83080bg.m132479c(z, aqVar, new C83125ar(oVar), C83126as.f226737a);
        return (C80436p) oVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

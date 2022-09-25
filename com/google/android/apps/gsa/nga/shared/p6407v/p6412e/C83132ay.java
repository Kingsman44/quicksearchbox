package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80431k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80432l;
import com.google.common.p4522b.C58370cn;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ay */
/* compiled from: PG */
public final /* synthetic */ class C83132ay implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83145bk f226743a;

    public /* synthetic */ C83132ay(C83145bk bkVar) {
        this.f226743a = bkVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83145bk bkVar = this.f226743a;
        C80431k kVar = (C80431k) C80432l.f220749e.createBuilder();
        kVar.mo74327a((Iterable) Collection.EL.stream(((C80432l) obj).f220752b).map(bkVar.f226755a).collect(C58370cn.f155946a));
        return (C80432l) kVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

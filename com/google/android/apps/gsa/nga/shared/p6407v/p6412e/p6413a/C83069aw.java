package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.common.p4522b.C58370cn;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.aw */
/* compiled from: PG */
public final class C83069aw implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C80413ae aeVar = (C80413ae) obj;
        C80412ad adVar = (C80412ad) C80413ae.f220688p.createBuilder();
        adVar.mo74324a((Iterable) Collection.EL.stream(aeVar.f220693d).map(C83066at.f226677a).collect(C58370cn.f155946a));
        boolean z = (aeVar.f220690a & 2) != 0;
        Objects.requireNonNull(aeVar);
        C83067au auVar = new C83067au(aeVar);
        Objects.requireNonNull(adVar);
        C83080bg.m132479c(z, auVar, new C83068av(adVar), C83077bd.f226687a);
        return (C80413ae) adVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

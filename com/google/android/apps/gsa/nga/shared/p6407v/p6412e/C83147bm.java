package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82860dc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82861dd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83077bd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bm */
/* compiled from: PG */
public final /* synthetic */ class C83147bm implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83157bw f226758a;

    public /* synthetic */ C83147bm(C83157bw bwVar) {
        this.f226758a = bwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83157bw bwVar = this.f226758a;
        C82861dd ddVar = (C82861dd) obj;
        C82860dc dcVar = (C82860dc) C82861dd.f225934g.createBuilder();
        int i = ddVar.f225936a;
        Objects.requireNonNull(ddVar);
        C83146bl blVar = new C83146bl(ddVar);
        Objects.requireNonNull(dcVar);
        boolean z = true;
        C83080bg.m132479c(1 == (i & 1), blVar, new C83148bn(dcVar), C83077bd.f226687a);
        boolean z2 = (ddVar.f225936a & 2) != 0;
        Objects.requireNonNull(ddVar);
        C83149bo boVar = new C83149bo(ddVar);
        Objects.requireNonNull(dcVar);
        C83080bg.m132478b(z2, boVar, new C83150bp(dcVar));
        boolean z3 = (ddVar.f225936a & 16) != 0;
        Objects.requireNonNull(ddVar);
        C83151bq bqVar = new C83151bq(ddVar);
        Objects.requireNonNull(dcVar);
        C83080bg.m132478b(z3, bqVar, new C83152br(dcVar));
        boolean z4 = (ddVar.f225936a & 8) != 0;
        Objects.requireNonNull(ddVar);
        C83153bs bsVar = new C83153bs(ddVar);
        Objects.requireNonNull(dcVar);
        C83080bg.m132478b(z4, bsVar, new C83154bt(dcVar));
        if ((ddVar.f225936a & 4) == 0) {
            z = false;
        }
        Objects.requireNonNull(ddVar);
        C83155bu buVar = new C83155bu(ddVar);
        Objects.requireNonNull(dcVar);
        C83080bg.m132479c(z, buVar, new C83156bv(dcVar), bwVar.f226768a);
        return (C82861dd) dcVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

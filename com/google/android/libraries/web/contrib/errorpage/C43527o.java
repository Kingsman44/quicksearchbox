package com.google.android.libraries.web.contrib.errorpage;

import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.o */
/* compiled from: PG */
public final /* synthetic */ class C43527o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C43529q f113654a;

    public /* synthetic */ C43527o(C43529q qVar) {
        this.f113654a = qVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C58528ij ijVar = this.f113654a.f113657b;
        C58893dc.m90996a(ijVar);
        return !ijVar.contains((C43514b) obj);
    }
}

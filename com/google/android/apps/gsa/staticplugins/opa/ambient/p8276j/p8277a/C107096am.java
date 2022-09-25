package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.am */
/* compiled from: PG */
public final /* synthetic */ class C107096am implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f298156a;

    public /* synthetic */ C107096am(C58528ij ijVar) {
        this.f298156a = ijVar;
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
        C58528ij ijVar = C107097an.f298157a;
        return !this.f298156a.contains((String) obj);
    }
}

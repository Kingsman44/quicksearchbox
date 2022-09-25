package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.v */
/* compiled from: PG */
public final /* synthetic */ class C107119v implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C107119v f298195a = new C107119v();

    private /* synthetic */ C107119v() {
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
        return ((String) obj).contains("HEADPHONE_CONTEXT");
    }
}

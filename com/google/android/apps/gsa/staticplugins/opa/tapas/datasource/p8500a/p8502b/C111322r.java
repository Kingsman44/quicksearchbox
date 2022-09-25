package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.r */
/* compiled from: PG */
public final /* synthetic */ class C111322r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309779a;

    public /* synthetic */ C111322r(C111305ag agVar) {
        this.f309779a = agVar;
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
        return this.f309779a.f309733c.mo99018a(((C49301bt) obj).f127426b) != C48670ae.SUGGESTION_GROUP_FALLBACK;
    }
}

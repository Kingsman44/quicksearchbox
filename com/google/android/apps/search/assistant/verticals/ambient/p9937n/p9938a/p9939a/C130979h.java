package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9938a.p9939a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C130979h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130984m f358351a;

    /* renamed from: b */
    public final /* synthetic */ double f358352b;

    public /* synthetic */ C130979h(C130984m mVar, double d) {
        this.f358351a = mVar;
        this.f358352b = d;
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
        return ((C130701b) obj).mo109791a() / this.f358352b > this.f358351a.f358361e;
    }
}

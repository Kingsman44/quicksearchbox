package com.google.android.libraries.web.shared.p3444d;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.shared.d.b */
/* compiled from: PG */
public final /* synthetic */ class C44090b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C44094f f114772a;

    public /* synthetic */ C44090b(C44094f fVar) {
        this.f114772a = fVar;
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
        return this.f114772a.f114776a.containsKey((Class) obj);
    }
}

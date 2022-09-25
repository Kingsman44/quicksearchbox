package com.google.android.libraries.search.silk.web.core;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.silk.web.core.d */
/* compiled from: PG */
public final /* synthetic */ class C40750d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Class f106851a;

    public /* synthetic */ C40750d(Class cls) {
        this.f106851a = cls;
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
        return this.f106851a.isAssignableFrom((Class) obj);
    }
}

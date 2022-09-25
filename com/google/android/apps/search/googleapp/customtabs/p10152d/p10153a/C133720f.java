package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C133720f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Class f364222a;

    public /* synthetic */ C133720f(Class cls) {
        this.f364222a = cls;
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
        return this.f364222a.isInstance((C133734t) obj);
    }
}

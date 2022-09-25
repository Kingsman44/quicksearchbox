package com.google.android.apps.search.podcasts.widgets.p10620b;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.podcasts.widgets.b.b */
/* compiled from: PG */
public final /* synthetic */ class C141196b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C141196b f383341a = new C141196b();

    private /* synthetic */ C141196b() {
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
        C141207m mVar = (C141207m) obj;
        return (mVar instanceof C141195a) && ((C141195a) mVar).f383335a != 0;
    }
}

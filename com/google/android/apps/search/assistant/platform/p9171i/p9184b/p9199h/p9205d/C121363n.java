package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9205d;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.d.n */
/* compiled from: PG */
public final /* synthetic */ class C121363n implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C121363n f336988a = new C121363n();

    private /* synthetic */ C121363n() {
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
        return ((Optional) obj).isPresent();
    }
}

package com.google.android.apps.search.assistant.libraries.p8946b;

import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.n */
/* compiled from: PG */
public final /* synthetic */ class C119251n implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C119251n f332558a = new C119251n();

    private /* synthetic */ C119251n() {
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
        int i = C119252o.f332559a;
        return !((C65753ak) obj).equals(C65753ak.UNKNOWN);
    }
}

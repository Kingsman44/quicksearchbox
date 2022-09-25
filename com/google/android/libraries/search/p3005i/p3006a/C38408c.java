package com.google.android.libraries.search.p3005i.p3006a;

import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.i.a.c */
/* compiled from: PG */
public final /* synthetic */ class C38408c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C38408c f101662a = new C38408c();

    private /* synthetic */ C38408c() {
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
        int i = C38409d.f101663a;
        return !((C65753ak) obj).equals(C65753ak.UNKNOWN);
    }
}

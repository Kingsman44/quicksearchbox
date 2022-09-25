package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import com.google.android.libraries.search.p2904c.p2964r.C37957a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.c.o.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C37923e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C37957a f100521a;

    public /* synthetic */ C37923e(C37957a aVar) {
        this.f100521a = aVar;
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
        return this.f100521a.mo41167b(((Integer) obj).intValue());
    }
}

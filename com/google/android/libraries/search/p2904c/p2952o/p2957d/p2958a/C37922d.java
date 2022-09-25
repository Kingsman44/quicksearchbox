package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.c.o.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C37922d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C37927i f100520a;

    public /* synthetic */ C37922d(C37927i iVar) {
        this.f100520a = iVar;
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
        return !this.f100520a.f100527a.f100529b.mo41167b(((Integer) obj).intValue());
    }
}

package com.google.android.libraries.lens.view.gleam;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.gleam.am */
/* compiled from: PG */
public final /* synthetic */ class C26454am implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26454am f72049a = new C26454am();

    private /* synthetic */ C26454am() {
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
        return !((C26447af) obj).f72001l;
    }
}

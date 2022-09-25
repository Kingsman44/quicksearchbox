package com.google.android.libraries.lens.view.p2067ak;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.ak.cf */
/* compiled from: PG */
public final /* synthetic */ class C25254cf implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f68717a;

    public /* synthetic */ C25254cf(String str) {
        this.f68717a = str;
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
        return ((String) obj).startsWith(this.f68717a);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.cs */
/* compiled from: PG */
public final /* synthetic */ class C106938cs implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f297868a = "com.google.android.apps.youtube.music";

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
        return this.f297868a.equals((String) obj);
    }
}

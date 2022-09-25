package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ab */
/* compiled from: PG */
public final /* synthetic */ class C124046ab implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C124046ab f342625a = new C124046ab();

    private /* synthetic */ C124046ab() {
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
        return ((Integer) obj).intValue() < 100000;
    }
}

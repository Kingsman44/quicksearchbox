package com.google.android.libraries.search.assistant.performer.communication.p2740e;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.e.k */
/* compiled from: PG */
public final /* synthetic */ class C35703k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35703k f93605a = new C35703k();

    private /* synthetic */ C35703k() {
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
        return ((Integer) obj).intValue() >= 0;
    }
}

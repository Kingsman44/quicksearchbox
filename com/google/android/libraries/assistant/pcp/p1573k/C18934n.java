package com.google.android.libraries.assistant.pcp.p1573k;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.n */
/* compiled from: PG */
public final /* synthetic */ class C18934n implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18934n f53232a = new C18934n();

    private /* synthetic */ C18934n() {
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

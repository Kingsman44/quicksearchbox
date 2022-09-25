package com.google.android.libraries.search.assistant.notification.p2709a.p2710a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.notification.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C34849l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C34849l f92421a = new C34849l();

    private /* synthetic */ C34849l() {
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

package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9987p;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.p.a */
/* compiled from: PG */
public final /* synthetic */ class C131526a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131526a f359396a = new C131526a();

    private /* synthetic */ C131526a() {
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

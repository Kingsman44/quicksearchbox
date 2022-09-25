package com.google.android.libraries.assistant.soda.p1606e.p1607a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.soda.e.a.f */
/* compiled from: PG */
public final /* synthetic */ class C19292f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C19292f f54015a = new C19292f();

    private /* synthetic */ C19292f() {
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

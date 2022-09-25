package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.f */
/* compiled from: PG */
public final /* synthetic */ class C130413f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130413f f357365a = new C130413f();

    private /* synthetic */ C130413f() {
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
        return ((String) obj).startsWith("actions.intent.");
    }
}

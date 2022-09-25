package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.af */
/* compiled from: PG */
public final /* synthetic */ class C33061af implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C33061af f88526a = new C33061af();

    private /* synthetic */ C33061af() {
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
        return ((String) obj).equals("datetime");
    }
}

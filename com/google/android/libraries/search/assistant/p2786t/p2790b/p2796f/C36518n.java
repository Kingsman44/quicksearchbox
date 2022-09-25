package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.n */
/* compiled from: PG */
public final /* synthetic */ class C36518n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f95291a;

    public /* synthetic */ C36518n(String str) {
        this.f95291a = str;
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
        return this.f95291a.startsWith((String) obj);
    }
}

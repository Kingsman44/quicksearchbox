package com.google.android.libraries.p10915aa.p10920b;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.aa.b.ar */
/* compiled from: PG */
public final /* synthetic */ class C146670ar implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C146670ar f396103a = new C146670ar();

    private /* synthetic */ C146670ar() {
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

package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.b */
/* compiled from: PG */
public final /* synthetic */ class C11654b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11654b f37628a = new C11654b();

    private /* synthetic */ C11654b() {
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

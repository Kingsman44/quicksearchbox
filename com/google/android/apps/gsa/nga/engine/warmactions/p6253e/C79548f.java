package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.f */
/* compiled from: PG */
public final /* synthetic */ class C79548f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79548f f218271a = new C79548f();

    private /* synthetic */ C79548f() {
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

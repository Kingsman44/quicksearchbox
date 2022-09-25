package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bl */
/* compiled from: PG */
public final /* synthetic */ class C77040bl implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77040bl f212639a = new C77040bl();

    private /* synthetic */ C77040bl() {
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

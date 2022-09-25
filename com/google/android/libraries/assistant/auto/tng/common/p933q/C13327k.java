package com.google.android.libraries.assistant.auto.tng.common.p933q;

import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.k */
/* compiled from: PG */
public final /* synthetic */ class C13327k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C13327k f41056a = new C13327k();

    private /* synthetic */ C13327k() {
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
        return Objects.nonNull(obj);
    }
}

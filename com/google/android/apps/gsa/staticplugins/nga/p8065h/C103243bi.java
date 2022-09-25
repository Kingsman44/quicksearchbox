package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.bi */
/* compiled from: PG */
public final /* synthetic */ class C103243bi implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C103243bi f288018a = new C103243bi();

    private /* synthetic */ C103243bi() {
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
        return Objects.nonNull((String) obj);
    }
}

package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.t */
/* compiled from: PG */
public final /* synthetic */ class C103291t implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C103291t f288091a = new C103291t();

    private /* synthetic */ C103291t() {
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
        return !((C103295x) ((Map.Entry) obj).getKey()).mo93704c().isEmpty();
    }
}

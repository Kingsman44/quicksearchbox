package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.ShortcutInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.u */
/* compiled from: PG */
public final /* synthetic */ class C111596u implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111596u f310331a = new C111596u();

    private /* synthetic */ C111596u() {
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
        return !((ShortcutInfo) obj).isDynamic();
    }
}

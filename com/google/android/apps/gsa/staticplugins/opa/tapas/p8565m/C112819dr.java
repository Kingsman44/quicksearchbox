package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dr */
/* compiled from: PG */
public final /* synthetic */ class C112819dr implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112819dr f312687a = new C112819dr();

    private /* synthetic */ C112819dr() {
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
        return !TextUtils.isEmpty((String) obj);
    }
}

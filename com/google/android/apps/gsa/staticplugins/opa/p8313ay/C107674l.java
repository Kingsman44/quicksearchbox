package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.l */
/* compiled from: PG */
public final /* synthetic */ class C107674l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C107674l f299672a = new C107674l();

    private /* synthetic */ C107674l() {
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

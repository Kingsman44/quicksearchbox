package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8356a;

import com.google.assistant.p3861at.C50173ng;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.a.e */
/* compiled from: PG */
public final /* synthetic */ class C108534e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f301952a;

    public /* synthetic */ C108534e(String str) {
        this.f301952a = str;
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
        return this.f301952a.equals(((C50173ng) obj).f130422b);
    }
}
